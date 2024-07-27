package com.ironhack.tfdtheorycraftbuild.services;


import com.ironhack.tfdtheorycraftbuild.model.CharactersModel;
import com.ironhack.tfdtheorycraftbuild.repositories.CharactersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CharactersService {
    private final CharactersRepository charactersRepository;

    public void createCharacter(String name, Integer passiveEffects, Integer skill1, Integer skill2, Integer skill3, Integer skill4, double maxHp, double maxMp, double shield, double defense, double fireResistance, double chillResistance, double electricResistance, double toxinResistance, double fireSkillPower, double chillSkillPower, double electricSkillPower, double toxinSkillPower, double fusionSkillPowerModifier, double singularSkillPowerModifier, double dimensionSkillPowerModifier, double techSkillPowerModifier, double skillCriticalHitRate, double skillCriticalHitDamage, double skillPower, double allAttributeResistances, double hpRegenModifier, double mpRegenModifier, double hpHeal, double skillCooldown, double skillCost, double skillEffectRange, double skillDuration, double skillSpeed, double criticalHitResistance, double skillPowerModifier) {
        log.info("Creating character");
        CharactersModel charactersModel = new CharactersModel(name, passiveEffects, skill1, skill2, skill3, skill4, maxHp, maxMp, shield, defense, fireResistance, chillResistance, electricResistance, toxinResistance, fireSkillPower, chillSkillPower, electricSkillPower, toxinSkillPower, fusionSkillPowerModifier, singularSkillPowerModifier, dimensionSkillPowerModifier, techSkillPowerModifier, skillCriticalHitRate, skillCriticalHitDamage, skillPower, allAttributeResistances, hpRegenModifier, mpRegenModifier, hpHeal, skillCooldown, skillCost, skillEffectRange, skillDuration, skillSpeed, criticalHitResistance, skillPowerModifier);
        charactersRepository.save(charactersModel);
    }
}
