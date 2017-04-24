package com.dormitory.mapper;

import SSM.model.SuperAdmin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by war on 2017/4/17.
 */
@Repository
public interface SuperAdminMapper {
    SuperAdmin selectSuperAdminById(@Param("id") int id);
    void insertSuperAdmin(@Param("superAdmin") SuperAdmin superAdmin);
    void deleteSuperAdmin(@Param("id") int id);
}
