package com.qf.withcar.config;

import com.qf.withcar.shiro.MyShiroRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * 自定义shiro配置
 */
@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean factoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager webSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(webSecurityManager);
//        shiroFilterFactoryBean.setUnauthorizedUrl("");//设置权限不足时去往的页面
//        shiroFilterFactoryBean.setSuccessUrl("/login");//设置登录访问页(匿名)
        shiroFilterFactoryBean.setLoginUrl("/index");
        HashMap<String , String> map = new HashMap<>();
//        map.put("/main","authc");//登录之后才可访问
        map.put("/index","anon");//匿名访问的资源
        map.put("/goInformation","anon");
        map.put("/goCenter","anon");//个人中心
        map.put("/delLogin","anon");//登录方法
        map.put("/cardiscounts","anon");//情报站
        map.put("/car_info","anon");//伴我选车
        map.put("/selectbrand","anon");//新车优惠
        map.put("/userLogin","anon");
        map.put("/userregister","anon");

        map.put("/*","anon");//其他的访问必须登录，通常放在最后加入
        //集合中存放访问权限
        shiroFilterFactoryBean.setUnauthorizedUrl("/userLogin");//权限不足的错误提示页
        //将map集合放入工厂管理中，
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);//装配拦截策略
        return shiroFilterFactoryBean;
    }

    @Bean(name = "defaultWebSecurityManager")  //配置安全管理器  （注入realm对象）
    public DefaultWebSecurityManager webSecurityManager(@Qualifier("myShiroRealm") MyShiroRealm myShiroRealm){
        DefaultWebSecurityManager webSecurityManager = new DefaultWebSecurityManager();
        webSecurityManager.setRealm(myShiroRealm);
        return webSecurityManager;
    }

    @Bean(name = "myShiroRealm")
    public MyShiroRealm myShiroRealm(){
        MyShiroRealm myShiroRealm = new MyShiroRealm();
        return myShiroRealm;
    }
}
