package com.maoba.system.dao;

import com.maoba.system.domain.RoleEntity;

public interface RoleEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated
     */
    int insert(RoleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated
     */
    int insertSelective(RoleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated
     */
    RoleEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RoleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RoleEntity record);
}