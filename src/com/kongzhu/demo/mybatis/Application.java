package com.kongzhu.demo.mybatis;

import org.apache.ibatis.session.SqlSession;

public class Application {

    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisHelper.getSqlSession();
        try {
            Integer id = 1;
            String message = sqlSession.selectOne("com.kongzhu.demo.mybatis.MessageMapper.selectById", id);
            System.out.println(message);
        } finally {
            sqlSession.close();
        }
    }

}
