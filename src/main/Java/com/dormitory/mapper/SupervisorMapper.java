package com.dormitory.mapper;

import SSM.model.Supervisor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by war on 2017/4/17.
 */
@Repository
public interface SupervisorMapper {
    Supervisor selectSvById(@Param("id") int id);
    List<Supervisor> selectAllSv();
    void insertSupervisor(@Param("supersivor") Supervisor supersiovor);
    void deleteSupersivor(@Param("id") int id);
    void updateSupersivor(@Param("supersivor") Supervisor supersivor);
}
