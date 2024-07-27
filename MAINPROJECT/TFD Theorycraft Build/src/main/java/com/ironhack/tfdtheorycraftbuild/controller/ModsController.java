package com.ironhack.tfdtheorycraftbuild.controller;

import com.ironhack.tfdtheorycraftbuild.services.ModsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mods")
@RequiredArgsConstructor
public class ModsController {
    private final ModsService modsService;
}
