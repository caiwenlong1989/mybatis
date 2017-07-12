package com.kongzhu.demo.mybatis2;

import org.apache.ibatis.session.SqlSession;

public class Application {

    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisHelper.getSqlSession();
        MessageMapper mapper = sqlSession.getMapper(MessageMapper.class);
        try {
            Integer id = 1;
            String message = mapper.selectById(id);
            System.out.println(message);
        } finally {
            sqlSession.close();
        }
    }

}
