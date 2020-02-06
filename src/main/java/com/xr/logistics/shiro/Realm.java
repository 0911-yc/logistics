package com.xr.logistics.shiro;

import com.xr.logistics.model.SyEmp;
import com.xr.logistics.model.SyMenus;
import com.xr.logistics.model.SyRoles;
import com.xr.logistics.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class Realm extends AuthorizingRealm {
    //引用service层


    private UserService userService;
    //为当前登录成功的用户授予权限和分配角色
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        //获取当前用户登录的用户
        SyEmp emp=(SyEmp)principal.getPrimaryPrincipal();
        //通过SimpleAuthorizationInfo做授权
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        for (SyRoles roles : emp.getRoles()){
            //为用户添加角色信息
            simpleAuthorizationInfo.addRole(roles.getRoleName());
            //添加权限
            for (SyMenus menus:roles.getMenus()){
                simpleAuthorizationInfo.addStringPermission(menus.getText());
            }
        }

        return simpleAuthorizationInfo;
    }

    //用来验证当前登录的用户，获取认证信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1.获取用户输入的账号
        String username= (String) token.getPrincipal();
        //2.通过username从数据库查找user实体
        SyEmp syEmp=userService.query(username);
        if (syEmp==null){
            return null;
        }
        //3.通过SimpleAuthenticationInfo做身份处理
        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(syEmp,syEmp.getAccount(),syEmp.getPwd());
        //4.该用户账号状态验证
        if (syEmp.getDisabled()==0){
            throw new AuthenticationException("该账号已经被禁用");
        }
        //返回处理对象
        return simpleAuthenticationInfo;
    }
}
