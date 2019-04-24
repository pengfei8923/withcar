package com.qf.withmycar.config;

import com.qf.withmycar.shiro.MyShiroRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * shiro配置对象
 * Created by jeffrey on 2019/4/10.
 */
@Configuration//标识本类为配置类
public class ShiroConfig {
    //    创建并配置shiro权限过滤器
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean filterFactoryBean = new ShiroFilterFactoryBean();//创建过滤器工厂对象
        filterFactoryBean.setSecurityManager(securityManager);//给过滤器配置安全管理器
//        filterFactoryBean.setLoginUrl("/login");//设置登录访问页
        filterFactoryBean.setSuccessUrl("/index");
        filterFactoryBean.setUnauthorizedUrl("/login");//权限不足时跳转的页面
//        定义一个过滤的列表
        Map<String,String >  map = new LinkedHashMap<>();
        map.put("/index","authc");//登陆之后方可访问的路径
        map.put("/login","anon");//匿名访问的资源
     //   map.put("/index","anon");//匿名访问的资源
        map.put("/dealLogin","anon");//匿名访问的资源
//        map.put("/one","perms[user_edit]");//登录，且拥有user_edit权限的用户可访问
//        map.put("/two","perms[user_forbidden]");//登录，且拥有user_forbidden权限的用户可访问
        map.put("/*","authc");//其他访问系登录，通常置于末尾
        filterFactoryBean.setFilterChainDefinitionMap(map);//设置过滤权限

        return filterFactoryBean;
    }
    //创建并配置shiro安全管理器
    @Bean("defaultWebSecurityManager")
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("myShiroRealm") MyShiroRealm myShiroRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm);//给安全管理器配置自定义安全策略
        return securityManager;
    }
    ///创建自定义的安全策略对象
    @Bean("myShiroRealm")//创建自定义的安全策略对象，并交给spring容器管理
    public MyShiroRealm myShiroRealm(@Qualifier("hashedCredentialsMatcher") HashedCredentialsMatcher credentialsMatcher ){
//        return new MyShiroRealm();
        MyShiroRealm myShiroRealm = new MyShiroRealm();//自定义安全策略
        myShiroRealm.setAuthenticationCachingEnabled(false);//关闭认证缓存
        myShiroRealm.setCredentialsMatcher(credentialsMatcher);//设定凭证匹配器
        return myShiroRealm;
    }

    /**
     * 开启Shiro注解(如@RequiresRoles,@RequiresPermissions),
     * 需借助SpringAOP扫描使用Shiro注解的类,并在必要时进行安全逻辑验证
     * 配置以下两个bean(DefaultAdvisorAutoProxyCreator和AuthorizationAttributeSourceAdvisor)
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }
    /**
     * 开启aop注解支持
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager defaultWebSecurityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(defaultWebSecurityManager);
        return authorizationAttributeSourceAdvisor;
    }
    /*
    添加凭证匹配器，是的shiro可以进行MD5凭证匹配
     */
    @Bean("hashedCredentialsMatcher")
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        System.out.println(credentialsMatcher+"+66666");
        credentialsMatcher.setHashAlgorithmName("MD5");//设定加密算法
        credentialsMatcher.setHashIterations(1);  //设定加密次数
        return credentialsMatcher;

    }
}
