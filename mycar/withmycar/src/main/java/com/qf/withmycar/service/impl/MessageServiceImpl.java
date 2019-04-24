package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.MessageMapper;
import com.qf.withmycar.pojo.Message;
import com.qf.withmycar.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageMapper messageMapper;

    @Override
    public List<Message> selectAllMessage() {
        List<Message> messages = messageMapper.selectAllMessage();
        return messages;
    }

    @Override
    public List<Message> selectById(Long id) {
        List<Message> messages = messageMapper.selectById(id);
        return messages;
    }

    @Override
    public void deleteById(Long l) {
        messageMapper.deleteById(l);
    }

    @Override
    public void insertMessage(Message message) {
        messageMapper.insertMessage(message);
    }

    @Override
    public void updateById(Message message) {
        messageMapper.updateById(message);
    }
}
