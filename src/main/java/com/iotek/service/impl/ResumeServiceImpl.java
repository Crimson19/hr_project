package com.iotek.service.impl;

import com.iotek.dao.ResumeDao;
import com.iotek.po.Resume;
import com.iotek.service.ResumeServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "resumeService")
public class ResumeServiceImpl implements ResumeServive {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public Resume findResumeByName(Resume resume) {
        if (resume == null) {
            return   null;
        }

        return resumeDao.findResumeByName(resume);
    }

    @Override
    public boolean addResume(Resume resume) {
        if (resume == null) {
            return  false;
        }
        return    resumeDao.addResume(resume);
    }

    @Override
    public boolean deleteResume(Resume resume) {
        return false;
    }

    @Override
    public boolean updateResume(Resume resume) {
        if (resume == null) {
            return  false;
        }
        return    resumeDao.updateResume(resume);
    }

    @Override
    public List<Resume> queryAllResume() {
        return null;
    }
}