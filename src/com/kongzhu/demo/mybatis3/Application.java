package com.kongzhu.demo.mybatis3;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Application {

    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisHelper.getSqlSession();
        MessageMapper mapper = sqlSession.getMapper(MessageMapper.class);
        try {
            Message message = new Message(2, "Java");
            int num = mapper.insertOne(message);
            sqlSession.commit();
            System.out.println(message);
            System.out.println("新增受影响的行数：" + num);
            System.out.println("--------------------------------------");
            
            List<Message> list = mapper.selectList();
            System.out.println(list);
            System.out.println("--------------------------------------");
            
            message.setText("Java Core");
            num = mapper.updateOne(message);
            sqlSession.commit();
            System.out.println(message);
            System.out.println("修改受影响的行数：" + num);
            System.out.println("--------------------------------------");
            
            list = mapper.selectList();
            System.out.println(list);
            System.out.println("--------------------------------------");
            
            num = mapper.deleteOne(message.getId());
            sqlSession.commit();
            System.out.println(message);
            System.out.println("删除受影响的行数：" + num);
            System.out.println("--------------------------------------");
            
            list = mapper.selectList();
            System.out.println(list);
            System.out.println("--------------------------------------");
        } finally {
            sqlSession.close();
        }
    }

}
