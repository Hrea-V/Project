package com.ironhack.tfdtheorycraftbuild.controller;


import com.ironhack.tfdtheorycraftbuild.model.Character;
import com.ironhack.tfdtheorycraftbuild.model.Effect;
import com.ironhack.tfdtheorycraftbuild.model.Skill;
import com.ironhack.tfdtheorycraftbuild.services.CharactersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class CharacterController {
    private final CharactersService charactersService;

    //Get all characters: Create a route to get all characters.
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Character> getAllCharacters() {
        return charactersService.getCharacters();
    }

    //Add new character: Create a route to add a new character.
    @PostMapping("/add/{characterName}/skill/{skill1}/{effectCharacter}")
    public void addCharacter(@PathVariable String characterName,@PathVariable Set<Skill> skill1,@PathVariable Set<Effect> effectCharacter) {
        charactersService.addCharacter(characterName, skill1, effectCharacter);
    }

    //delete character: Create a route to delete a character.
    @DeleteMapping("/delete/{characterId}")
    public void deleteCharacter(@PathVariable Integer characterId) {
        charactersService.deleteCharacter(characterId);
    }

    //update character: Create a route to update a character.

}
