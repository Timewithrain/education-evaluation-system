package com.watermelon.service;

import com.watermelon.entity.Permission;

import java.util.List;

public interface PermissionService {

    Permission getPermissionById(int id);

    Permission getPermissionByName(String name);

    List<Permission> listPermission();

    void addPermission(Permission permission);

    void updatePermission(Permission permission);

    void deletePermission(int id);

}
