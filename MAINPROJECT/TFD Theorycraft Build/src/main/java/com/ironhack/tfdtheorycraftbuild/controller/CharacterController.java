package com.ironhack.tfdtheorycraftbuild.controller;


import com.ironhack.tfdtheorycraftbuild.model.Character;
import com.ironhack.tfdtheorycraftbuild.services.CharactersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class CharacterController {
    private final CharactersService charactersService;

//    //Get all characters: Create a route to get all characters.
//    @GetMapping("/all")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Character> getAllCharacters() {
//        return charactersService.getAllCharacters();
//    }
//
//    //Add new character: Create a route to add a new character.
//    @PostMapping("/add/{characterName}/{passiveEffect}/{skill1}/{skill2}/{skill3}/{skill4}/{maxHp}/{maxMp}/{shield}/{defense}/{fireResistance}/{chillResistance}/{electricResistance}/{toxinResistance}/{fireSkillPower}/{chillSkillPower}/{electricSkillPower}/{toxinSkillPower}/{fusionSkillPowerModifier}/{singularSkillPowerModifier}/{dimensionSkillPowerModifier}/{techSkillPowerModifier}/{skillCriticalHitRate}/{skillCriticalHitDamage}/{skillPower}/{allAttributeResistances}/{hpRegenModifier}/{mpRegenModifier}/{hpHeal}/{skillCooldown}/{skillCost}/{skillEffectRange}/{skillDuration}/{skillSpeed}/{criticalHitResistance}/{skillPowerModifier}")
//    public void addCharacter(String characterName, Integer passiveEffect, Integer skill1, Integer skill2, Integer skill3, Integer skill4, double maxHp, double maxMp, double shield, double defense, double fireResistance, double chillResistance, double electricResistance, double toxinResistance, double fireSkillPower, double chillSkillPower, double electricSkillPower, double toxinSkillPower, double fusionSkillPowerModifier, double singularSkillPowerModifier, double dimensionSkillPowerModifier, double techSkillPowerModifier, double skillCriticalHitRate, double skillCriticalHitDamage, double skillPower, double allAttributeResistances, double hpRegenModifier, double mpRegenModifier, double hpHeal, double skillCooldown, double skillCost, double skillEffectRange, double skillDuration, double skillSpeed, double criticalHitResistance, double skillPowerModifier) {
//        charactersService.addCharacter(characterName, passiveEffect, skill1, skill2, skill3, skill4, maxHp, maxMp, shield, defense, fireResistance, chillResistance, electricResistance, toxinResistance, fireSkillPower, chillSkillPower, electricSkillPower, toxinSkillPower, fusionSkillPowerModifier, singularSkillPowerModifier, dimensionSkillPowerModifier, techSkillPowerModifier, skillCriticalHitRate, skillCriticalHitDamage, skillPower, allAttributeResistances, hpRegenModifier, mpRegenModifier, hpHeal, skillCooldown, skillCost, skillEffectRange, skillDuration, skillSpeed, criticalHitResistance, skillPowerModifier);
//    }
//
//    //delete character: Create a route to delete a character.
//    @DeleteMapping("/delete/{characterId}")
//    public void deleteCharacter(@PathVariable Integer characterId) {
//        charactersService.deleteCharacter(characterId);
//    }

    //update character: Create a route to update a character.

}
