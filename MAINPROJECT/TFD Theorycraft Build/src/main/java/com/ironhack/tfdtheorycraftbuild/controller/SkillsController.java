package com.ironhack.tfdtheorycraftbuild.controller;

import com.ironhack.tfdtheorycraftbuild.model.Skill;
import com.ironhack.tfdtheorycraftbuild.services.SkillsService;
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
//
//    //Get all skills
//    @RequestMapping("/all")
//    public List<Skill> getSkills() {
//        return skillsService.getSkills();
//    }
//
//    //Add a new skill
//    @RequestMapping("/add/{skillName}/{description}/{effect1}/{value1}/{effect2}/{value2}/{effect3}/{value3}/{effect4}/{value4}/{effect5}/{value5}/{effect6}/{value6}/{effect7}/{value7}/{effect8}/{value8}/{effect9}/{value9}/{effect10}/{value10}")
//    public void addSkill(@PathVariable String skillName, @PathVariable String description, @PathVariable Integer effect1, @PathVariable Integer value1, @PathVariable Integer effect2, @PathVariable Integer value2, @PathVariable Integer effect3, @PathVariable Integer value3, @PathVariable Integer effect4, @PathVariable Integer value4, @PathVariable Integer effect5, @PathVariable Integer value5, @PathVariable Integer effect6, @PathVariable Integer value6, @PathVariable Integer effect7, @PathVariable Integer value7, @PathVariable Integer effect8, @PathVariable Integer value8, @PathVariable Integer effect9, @PathVariable Integer value9, @PathVariable Integer effect10, @PathVariable Integer value10) {
//        skillsService.addSkill(skillName, description, effect1, value1, effect2, value2, effect3, value3, effect4, value4, effect5, value5, effect6, value6, effect7, value7, effect8, value8, effect9, value9, effect10, value10);
//    }
//
//    //Delete a skill
//    @RequestMapping("/delete/{skillId}")
//    public void deleteSkill(@PathVariable Integer skillId) {
//        skillsService.deleteSkill(skillId);
//    }

}
