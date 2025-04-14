package org.example.test;

import org.apache.ibatis.session.SqlSession;
import org.example.mapper.EmpMapper;
import org.example.pojo.Emp;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.List;

public class MavenTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> all = empMapper.findAll();
        all.forEach(System.out::println);
    }
}
