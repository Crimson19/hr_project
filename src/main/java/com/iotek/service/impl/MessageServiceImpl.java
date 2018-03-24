package com.iotek.service.impl;

import com.iotek.dao.MessageDao;
import com.iotek.po.Message;
import com.iotek.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "messageService")
public class MessageServiceImpl implements MessageService{

    @Autowired
    private MessageDao messageDao;

    @Override
    public boolean addMessage(Message message) {
        return messageDao.addMessage(message);
    }

    @Override
    public boolean updateMessage(Message message) {

        return messageDao.updateMessage(message);
    }

    @Override
    public List<Message> queryMessage(Message message) {
        return messageDao.queryMessage(message);
    }
}