package com.iotek.dao;

import com.iotek.po.JobType;

import java.util.List;

public interface JobTypeDao {
    JobType findJobTypeByName(JobType jobType);
    boolean updateJobType(JobType jobType);
    boolean addJobType(JobType jobType);
    List<JobType> queryJobType(JobType jobType);
}