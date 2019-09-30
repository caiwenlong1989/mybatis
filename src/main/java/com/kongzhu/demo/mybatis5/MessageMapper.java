package com.kongzhu.demo.mybatis5;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MessageMapper {
    @Update("insert into message (id, text) values (#{id}, #{text})")
    int insert(Message message);
    @Update("update message set text = #{text} where id = #{id}")
    int update(Message message);
    @Update("delete from message where id = #{id}")
    int delete(Integer id);
    @Select("select id, text from message")
    List<Message> selectList();
}
