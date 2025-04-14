package org.example.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
// mybatis工具类 用于获取SqlSessionFactory以及SqlSession对象
public class MybatisUtils {
    static SqlSessionFactory sqlSessionFactory=null;
    static {
        //    mybatis核型配置文件
        String resource = "mybatis-config.xml";
//           通过Resoures工具类加载核心配置文件，获得输入流
        InputStream inputStream;

        {
            try {
                inputStream = Resources.getResourceAsStream(resource);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//           通过SqlSessionFactoryBuilder构建SqlSessionFactory对象
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    public static SqlSession getSqlSession() {
        //获取SqlSession对象
        return sqlSessionFactory.openSession();
    }
}
