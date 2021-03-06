package com.maoba.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.maoba.system.domain.PermissionEntity;

public interface PermissionEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PermissionEntity record);

    int insertSelective(PermissionEntity record);

    PermissionEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionEntity record);

    int updateByPrimaryKey(PermissionEntity record);
    
	List<PermissionEntity> queryPermissionByParentId(@Param(value="parentId") Long id);
}