package com.kongzhu.demo.mybatis5;

public class Message {
    private Integer id;
    private String text;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Message() {
        super();
    }
    public Message(Integer id, String text) {
        super();
        this.id = id;
        this.text = text;
    }
    @Override
    public String toString() {
        return "Message [id=" + id + ", text=" + text + "]";
    }
}
