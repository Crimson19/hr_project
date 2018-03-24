package com.iotek.dao;

import com.iotek.po.Skill;

public interface SkillDao {
    boolean addSkill(Skill skill);
    Skill updateSkill(Skill skill);
    Skill querySkill(Skill skill);
}