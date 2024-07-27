package com.ironhack.tfdtheorycraftbuild.controller;


import com.ironhack.tfdtheorycraftbuild.services.CharactersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class CharacterController {
    private final CharactersService charactersService;



}
