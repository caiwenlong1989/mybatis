package com.kongzhu.demo.mybatis4;

import java.util.List;

public interface MessageMapper {
    int insertOne(Message message);
    int updateOne(Message message);
    int deleteOne(Integer id);
    List<Message> selectList();
}
