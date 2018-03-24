package com.iotek.service;

import com.iotek.po.Skill;

public interface SkillService {
    boolean addSkill(Skill skill);
    Skill updateSkill(Skill skill);
    Skill querySkill(Skill skill);
}