package com.dormitory.mapper;

import SSM.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by war on 2017/4/17.
 */

@Repository
public interface StudentMapper {
     Student selectStuById(@Param("id") int id);
     List<Student> selectAllStu();
     void insertStudent(@Param("student") Student student);
     void deleteStudent(@Param("id") int id);
     void updateStudent(@Param("student") Student student);
}
