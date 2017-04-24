package com.dormitory.mapper;

import SSM.model.Repairer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by war on 2017/4/17.
 */
@Repository
public interface RepairerMapper {
    Repairer selectRepByid(@Param("") int id);
    List<Repairer> selectAllRep();
    Repairer selectByTypeAndState(@Param("repairer_type") String repairer_type, @Param("state") String state);
    void insertReq(@Param("repairer") Repairer repairer);
    void deleteReq(@Param("") int id);
    void updateReq(@Param("repairer") Repairer repairer);
}
