package com.ironhack.tfdtheorycraftbuild.controller;

import com.ironhack.tfdtheorycraftbuild.services.SkillsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("skills")
@RequiredArgsConstructor
public class SkillsController {
    private final SkillsService skillsService;

}
