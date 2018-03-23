package com.iotek.service;

import com.iotek.po.Job;

import java.util.List;

public interface JobService {
    boolean addJob(Job job);
    Job updateJob(Job job);
    List<Job> queryJob(Job job);
}