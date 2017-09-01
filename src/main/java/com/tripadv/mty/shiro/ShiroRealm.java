package com.tripadv.mty.shiro;


import com.tripadv.mty.domain.user.User;
import com.tripadv.mty.service.user.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ShiroRealm extends AuthenticatingRealm {


    @Autowired
    private UserService userService;


    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();//获取用户名
        System.out.println("---2--->>"+username);
        User user = userService.findUser(username);
        if (user==null){
            throw  new UnknownAccountException();
        }
        //采用盐值加密
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                getName()
        );
        System.out.println("---->>"+info.getPrincipals().getPrimaryPrincipal());
        return info;
    }


}
