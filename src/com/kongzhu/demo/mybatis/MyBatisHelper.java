package com.kongzhu.demo.mybatis;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisHelper {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        Reader reader = null;
        try {
            reader = new FileReader("src/com/kongzhu/demo/mybatis/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
