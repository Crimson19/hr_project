package com.iotek.service.impl;

import com.iotek.dao.JobTypeDao;
import com.iotek.po.JobType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "jobTypeService")
public class JobTypeServiceImpl implements com.iotek.service.JobTypeService {

    @Autowired
    private JobTypeDao jobTypeDao;

    @Override
    public JobType findJobTypeByName(JobType jobType) {
        if (jobType== null) {
            return   null;
        }
        return jobTypeDao.findJobTypeByName(jobType);
    }

    @Override
    public boolean updateJobType(JobType jobType) {
        if (jobType== null) {
            return   false;
        }
        return jobTypeDao.updateJobType(jobType);
    }

    @Override
    public boolean addJobType(JobType jobType) {
        if (jobType== null) {
            return   false;
        }
        return jobTypeDao.addJobType(jobType);
    }

    @Override
    public List<JobType> queryJobType(JobType jobType) {
        return jobTypeDao.queryJobType(jobType);
    }
}