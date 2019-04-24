package com.qf.withmycar.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Message implements Serializable {
    private Long id;//消息id
    private String title;//标题
    private String content;//内容
    private String link;//更多
    private Date sendTime;//发送时间
    private String sender;//发送者

//    public Message() {
//    }
//
//    public Message(Long id, String title, String content, String link, Integer sendTime, String sender) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//        this.link = link;
//        this.sendTime = sendTime;
//        this.sender = sender;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getLink() {
//        return link;
//    }
//
//    public void setLink(String link) {
//        this.link = link;
//    }
//
//    public Integer getSendTime() {
//        return sendTime;
//    }
//
//    public void setSendTime(Integer sendTime) {
//        this.sendTime = sendTime;
//    }
//
//    public String getSender() {
//        return sender;
//    }
//
//    public void setSender(String sender) {
//        this.sender = sender;
//    }
//
//    @Override
//    public String toString() {
//        return "Message{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                ", link='" + link + '\'' +
//                ", sendTime=" + sendTime +
//                ", sender='" + sender + '\'' +
//                '}';
//    }
}