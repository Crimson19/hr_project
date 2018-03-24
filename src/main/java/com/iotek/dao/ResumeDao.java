package com.iotek.dao;

import com.iotek.po.Resume;

import java.util.List;

public interface ResumeDao {
    Resume findResumeByName(Resume resume);


    boolean addResume(Resume resume);

    boolean deleteResume(Resume resume);

    Resume updateResume(Resume resume);

    List<Resume> queryResume(Resume resume);
}