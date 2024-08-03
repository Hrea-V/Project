package com.ironhack.tfdtheorycraftbuild.service;


import com.ironhack.tfdtheorycraftbuild.model.Character;
import com.ironhack.tfdtheorycraftbuild.model.Effect;
import com.ironhack.tfdtheorycraftbuild.model.Skill;
import com.ironhack.tfdtheorycraftbuild.repositories.CharactersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Slf4j
public class CharactersService {
    private final CharactersRepository charactersRepository;

    //Get all characters
    public List<Character> getCharacters() {
        log.info("Getting all characters");
        return charactersRepository.findAll();
    }
    //add a new character
    public void addCharacter(String name, Set<Skill> skillsUsed, Set<Effect> effectCharacter)
    {
        log.info("Adding character: " + name);
        charactersRepository.save(new Character(name, skillsUsed, effectCharacter));
    }
    //Delete a character
    public void deleteCharacter(Integer characterId) {
        log.info("Deleting character: " + characterId);
        charactersRepository.deleteById(characterId);
    }



}