package com.iotek.dao;

import com.iotek.po.Message;

import java.util.List;

public interface MessageDao {
    boolean addMessage(Message message);
    boolean updateMessage(Message message);
    List<Message> queryMessage(Message message);
}