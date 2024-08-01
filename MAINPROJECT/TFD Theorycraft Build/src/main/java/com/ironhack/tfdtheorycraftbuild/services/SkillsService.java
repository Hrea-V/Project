package com.ironhack.tfdtheorycraftbuild.services;

import com.ironhack.tfdtheorycraftbuild.model.SkillsModel;
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
    public List<SkillsModel> getSkills() {
        log.info("Getting all skills");
        return skillsRepository.findAll();
    }
    //Add a new skill
    public void addSkill(String name, String description, Integer skillEffect1, double skillValue1, Integer skillEffect2, double skillValue2, Integer skillEffect3, double skillValue3, Integer skillEffect4, double skillValue4, Integer skillEffect5, double skillValue5, Integer skillEffect6, double skillValue6, Integer skillEffect7, double skillValue7, Integer skillEffect8, double skillValue8, Integer skillEffect9, double skillValue9, Integer skillEffect10, double skillValue10) {
        log.info("Creating a new skill");
        SkillsModel skillsModel = new SkillsModel(name, description, skillEffect1, skillValue1, skillEffect2, skillValue2, skillEffect3, skillValue3, skillEffect4, skillValue4, skillEffect5, skillValue5, skillEffect6, skillValue6, skillEffect7, skillValue7, skillEffect8, skillValue8, skillEffect9, skillValue9, skillEffect10, skillValue10);
        skillsRepository.save(skillsModel);
    }
    //Delete a skill
    public void deleteSkill(Integer skillId) {
        log.info("Deleting skill: " + skillId);
        skillsRepository.deleteById(skillId);
    }


}
