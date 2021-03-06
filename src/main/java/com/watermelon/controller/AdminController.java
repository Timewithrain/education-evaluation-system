package com.watermelon.controller;

import com.watermelon.entity.Permission;
import com.watermelon.entity.Role;
import com.watermelon.entity.User;
import com.watermelon.service.PermissionService;
import com.watermelon.service.RoleService;
import com.watermelon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;

    @PostMapping("/addUser")
    public String addUser(@RequestParam User user) {
        userService.addUser(user);
        return "/user/add";
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestParam User user){
        userService.updateUser(user);
        return "redirect:/admin/listUser";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam int id){
        userService.deleteUser(id);
        return "redirect:/admin/listUser";
    }

    @ResponseBody
    @GetMapping("/listUser")
    public List<User> listUser() {
        List<User> list = userService.listUser();
        return list;
    }

    @PostMapping("/addRole")
    public String addRole(@RequestParam Role role){
        roleService.addRole(role);
        return "redirect:/admin/listRole";
    }

    @PostMapping("/updateRole")
    public String updateRole(@RequestParam Role role){
        roleService.updateRole(role);
        return "redirect:/admin/listRole";
    }

    @GetMapping("/deleteRole")
    public String deleteRole(@RequestParam int id){
        roleService.deleteRole(id);
        return "redirect:/admin/listRole";
    }

    @ResponseBody
    @GetMapping("/listRole")
    public List<Role> listRole(){
        return roleService.listRole();
    }

    @PostMapping("/addPerms")
    public String addPerms(@RequestParam Permission permission){
        permissionService.addPermission(permission);
        return "redirect:/admin/listPerms";
    }

    @PostMapping("/updatePerms")
    public String updatePerms(@RequestParam Permission permission) {
        permissionService.updatePermission(permission);
        return "redirect:/admin/listPerms";
    }

    @GetMapping("/deletePerms")
    public String deletePerms(@RequestParam int id){
        permissionService.deletePermission(id);
        return "redirect:/admin/listPerms";
    }

    @ResponseBody
    @GetMapping("/listPerms")
    public List<Permission> listPermission(){
        return permissionService.listPermission();
    }

}
