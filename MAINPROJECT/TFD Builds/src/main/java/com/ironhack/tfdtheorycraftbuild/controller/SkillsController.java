package com.ironhack.tfdtheorycraftbuild.controller;

import com.ironhack.tfdtheorycraftbuild.model.Skill;
import com.ironhack.tfdtheorycraftbuild.service.SkillsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skills")
@RequiredArgsConstructor
public class SkillsController {
    private final SkillsService skillsService;

    //Get all skills
    @RequestMapping("/all")
    public List<Skill> getSkills() {
        return skillsService.getSkills();
    }

    //Add a new skill
    @RequestMapping("/add/SkillName/{name}/description/{description}/value/{value}")
    public void addSkill(@PathVariable String name, @PathVariable String description, @PathVariable Double value) {
        skillsService.addSkill(name, description, value);
    }

    //Delete a skill
    @RequestMapping("/delete/{skillId}")
    public void deleteSkill(@PathVariable Integer skillId) {
        skillsService.deleteSkill(skillId);
    }

}