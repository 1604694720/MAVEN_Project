package org.example.mapper;

import org.example.pojo.Emp;

import java.util.List;
//操作EMP表对外暴露的接口
public interface EmpMapper {
    //查询所有雇员信息
    List<Emp> findAll();
}
