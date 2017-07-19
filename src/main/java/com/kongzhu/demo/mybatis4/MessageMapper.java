package com.kongzhu.demo.mybatis4;

import java.util.List;

public interface MessageMapper {
    int insert(Message message);
    int update(Message message);
    int delete(Integer id);
    List<Message> selectList();
}
