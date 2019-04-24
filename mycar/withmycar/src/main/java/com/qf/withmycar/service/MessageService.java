package com.qf.withmycar.service;

import com.qf.withmycar.pojo.Message;

import java.util.List;

public interface MessageService {

    //    展示所有消息
    public List<Message> selectAllMessage();
    //    预览消息
    public List<Message> selectById(Long id);
    //    根据id删除消息
    public void deleteById(Long l);
    //    增加消息
    public void insertMessage(Message message);
    //    修改消息
    public void updateById(Message message);
}
