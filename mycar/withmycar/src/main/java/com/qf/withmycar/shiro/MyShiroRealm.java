package com.qf.withmycar.shiro;

import com.qf.withmycar.dto.AdminMenuAuthDto;
import com.qf.withmycar.pojo.AdminUser;
import com.qf.withmycar.service.AdminUserSrvice;
import com.qf.withmycar.service.impl.AdminUserSrviceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 自定义安全策略
 */
public class MyShiroRealm extends AuthorizingRealm {
    @Autowired(required = false)
    AdminUserSrvice adminUserSrvice;
    @Autowired(required = false)
    AdminUserSrviceImpl adminUserSrviceImpl;
    //    授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        获取主体信息
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();//用户信息
//根据用户查询权限清单
        List<AdminMenuAuthDto> sysPermissions = adminUserSrvice.selectUsernameQuanxian((String) principal);
//        获取用户权限字符串集合（去重）
        Set<String> authorizedSet  = new HashSet<>();
        for (AdminMenuAuthDto perm: sysPermissions ) {
          //  System.out.println(perm);
            String permissionName = perm.getName();
           // System.out.println(permissionName);
            authorizedSet.add(permissionName);
        }
//        常见授权信息对象
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        给授权信息对象赋权限
        authorizationInfo.setStringPermissions(authorizedSet);
        return authorizationInfo;
    }
//认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authToken) throws AuthenticationException {
        Object principal = authToken.getPrincipal();//获取用户信息
        String username = (String )principal;//用户名
        AdminUser sysUser = adminUserSrvice.findUserByUsername(username);//根据用户名查询用户对象（含密码）
        if(sysUser != null) {
            String credentials = sysUser.getPassword();//获取查询的密码
            /************MD5************/
            //从数据库中获取密码的密文
            ByteSource salt = ByteSource.Util.bytes(username);
            /*************Md5*************/
            String realmName = this.getName();//获取realm的名称
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(principal, credentials,salt, realmName);
            return authenticationInfo;
        }
        return null;
    }
}
