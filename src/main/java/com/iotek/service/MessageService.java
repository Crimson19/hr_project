package com.iotek.service;

import com.iotek.po.Message;

import java.util.List;

public interface MessageService {
    boolean addMessage(Message message);
    boolean updateMessage(Message message);
    List<Message> queryMessage(Message message);
}