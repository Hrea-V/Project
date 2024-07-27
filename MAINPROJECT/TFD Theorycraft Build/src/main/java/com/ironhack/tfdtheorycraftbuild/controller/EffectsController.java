package com.ironhack.tfdtheorycraftbuild.controller;

import com.ironhack.tfdtheorycraftbuild.services.EffectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("effects")
@RequiredArgsConstructor
public class EffectsController {
    private final EffectsService effectsService;

}
