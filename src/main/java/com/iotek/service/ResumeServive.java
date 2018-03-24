package com.iotek.service;

import com.iotek.po.Resume;

import java.util.List;

public interface ResumeServive {

    boolean addResume(Resume resume);

    boolean deleteResume(Resume resume);

    Resume updateResume(Resume resume);

    List<Resume> queryResume(Resume resume);
}