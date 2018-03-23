package com.iotek.service;

import com.iotek.po.JobType;

import java.util.List;

public interface JobTypeService {
    JobType findJobTypeByName(JobType jobType);
    boolean updateJobType(JobType jobType);
    boolean addJobType(JobType jobType);
    List<JobType> queryJobType(JobType jobType);
}