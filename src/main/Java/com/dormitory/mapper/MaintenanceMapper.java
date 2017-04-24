package com.dormitory.mapper;

import SSM.model.Maintenance;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by war on 2017/4/17.
 */
@Repository
public interface MaintenanceMapper {
    Maintenance selectMaintenanceById(@Param("id") int id);
    Maintenance selectMaintenanceByStu(@Param("stu_name") String stu_name);
    Maintenance selectMaintenanceByRep(@Param("rep_name") String rep_name);
    List<Maintenance> selectAllMaintenance();
    void insertReform(@Param("maintenance") Maintenance maintenance);
    void updateAllocate(@Param("maintenance") Maintenance maintenance);
    void updateResponse(@Param("maintenance") Maintenance maintenance);
    void updateEstimate(@Param("maintenance") Maintenance maintenance);
    void deleteMaintenance(@Param("id") int id);
}
