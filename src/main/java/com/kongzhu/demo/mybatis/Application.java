package com.kongzhu.demo.mybatis;

import org.apache.ibatis.session.SqlSession;

public class Application {

    public static void main(String[] args) {
        // 从 SqlSessionFactory 中获取 SqlSession
        SqlSession sqlSession = MyBatisHelper.getSqlSession();
        try {
            Integer id = 1;
            // 在命名空间“com.kongzhu.demo.mybatis.MessageMapper”中定义了一个名为“selectById”的映射语句，
            // 这样它就允许你使用指定的完全限定名“com.kongzhu.demo.mybatis.MessageMapper.selectById”来调用映射语句
            // 根据 SQL 语句 Key（一个字符串常量：namespace+id）和参数检索单条记录
            String message = sqlSession.selectOne("com.kongzhu.demo.mybatis.MessageMapper.selectById", id);
            System.out.println(message);
        } finally {
            // 始终记得关闭SqlSession
            sqlSession.close();
        }
    }

}
