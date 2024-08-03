package com.ironhack.tfdtheorycraftbuild.service;

import com.ironhack.tfdtheorycraftbuild.model.Skill;
import com.ironhack.tfdtheorycraftbuild.repositories.SkillsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class SkillsService {
    private final SkillsRepository skillsRepository;

    //Get all skills
    public List<Skill> getSkills() {
        log.info("Getting all skills");
        return skillsRepository.findAll();
    }
    //add a new skill
    public void addSkill (String name, String description, Double value) {
        log.info("Adding skill: " + name);
        skillsRepository.save(new Skill(name, description, value));
    }


    //Delete a skill
    public void deleteSkill(Integer skillId) {
        log.info("Deleting skill: " + skillId);
        skillsRepository.deleteById(skillId);
    }



}