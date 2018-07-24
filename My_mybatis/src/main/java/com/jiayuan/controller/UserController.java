package com.jiayuan.controller;

import com.jiayuan.service.UserRoleService;
import com.jiayuan.domain.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LuoYJ on 2018/7/20.
 */
@RestController
public class UserController {

    @Autowired
    private UserRoleService userRoleService;

    @GetMapping(value = "/detailed/{uid}")
    public UserRole selectDetailed(@PathVariable("uid") int uid){
        System.out.println("----------------");
        UserRole userRole = userRoleService.selectUserDetailed(uid);
        return userRole;
    }
}
