package com.iotek.service.impl;

import com.iotek.dao.SkillDao;
import com.iotek.po.Skill;
import com.iotek.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "skillService")
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillDao skillDao;

    @Override
    public boolean addSkill(Skill skill) {
        return skillDao.addSkill(skill);
    }

    @Override
    public Skill updateSkill(Skill skill) {
        return skillDao.updateSkill(skill);
    }

    @Override
    public Skill querySkill(Skill skill) {
        return skillDao.querySkill(skill);
    }
}