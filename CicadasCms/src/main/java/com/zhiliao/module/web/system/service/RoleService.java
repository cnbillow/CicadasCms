package com.zhiliao.module.web.system.service;

import com.zhiliao.mybatis.model.master.TSysPermission;
import com.zhiliao.mybatis.model.master.TSysRole;
import com.zhiliao.mybatis.model.master.TSysRolePermission;

import java.util.List;

/**
 * Created by binary on 2017/4/14.
 */
public interface RoleService {

    TSysRole findByid(Integer id);

    TSysRole findByIdAndTypeId(Integer id,Integer typeId);

    String delete(Integer id);

    String update(TSysRole role,Integer[] permissionId);

    String save(TSysRole role,Integer[] permissionId);

    List<TSysRole> findByTypeId(Integer typeId);

    List<TSysPermission> findPermissonByPid(Integer pid);

    Integer findPermissionCountByRoleId(Integer roleId,Integer permissionId);

    Integer  SaveRolePermission(TSysRolePermission rolePermission);

    TSysPermission findPermissonByid(Integer pid);

    String save(TSysPermission permission);

    String update(TSysPermission permission);

    String delectPermissionById(Integer id);

}
