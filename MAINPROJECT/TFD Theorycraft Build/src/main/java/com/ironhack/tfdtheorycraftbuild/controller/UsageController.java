package com.ironhack.tfdtheorycraftbuild.controller;

import com.ironhack.tfdtheorycraftbuild.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/build")
@RequiredArgsConstructor
public class UsageController {
    private final BuildsService buildsService;



}
