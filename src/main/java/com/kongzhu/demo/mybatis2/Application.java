package com.kongzhu.demo.mybatis2;

import org.apache.ibatis.session.SqlSession;

public class Application {

    public static void main(String[] args) {
        // 从 SqlSessionFactory 中获取 SqlSession
        SqlSession sqlSession = MyBatisHelper.getSqlSession();
        // 使用对于给定语句能够合理描述参数和返回值的接口
        // 不但可以执行更清晰和类型安全的代码，而且还不用担心易错的字符串字面值以及强制类型转换
        MessageMapper mapper = sqlSession.getMapper(MessageMapper.class);
        try {
            Integer id = 1;
            // 通过 Mapper 接口动态代理实现 SQL 语句检索单条记录
            String message = mapper.selectById(id);
            System.out.println(message);
        } finally {
            // 始终记得关闭SqlSession
            sqlSession.close();
        }
    }

}
