package com.iotek.service.impl;

import com.iotek.dao.JobDao;
import com.iotek.po.Job;
import com.iotek.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "jobService")
public class JobServiceImpl implements JobService {

    @Autowired
    private JobDao jobDao;

    @Override
    public boolean addJob(Job job) {
        if (job == null) {
            return  false;
        }
        return   jobDao.addJob(job);
    }

    @Override
    public Job updateJob(Job job) {
        return jobDao.updateJob(job);
    }

    @Override
    public List<Job> queryJob(Job job) {
        return jobDao.queryJob(job);
    }
}