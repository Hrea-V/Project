package com.ironhack.tfdtheorycraftbuild.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table( name = "characters")
@NoArgsConstructor
@Entity
public class CharactersModel {
    @Id
    @GeneratedValue( strategy = IDENTITY)
    @Column(name = "characters_id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "passive_effects")
    private Integer passiveEffects;
    @Column(name = "skill1")
    private Integer skill1;
    @Column(name = "skill2")
    private Integer skill2;
    @Column(name = "skill3")
    private Integer skill3;
    @Column(name = "skill4")
    private Integer skill4;
    @Column(name = "max_hp")
    private double maxHp;
    @Column(name = "max_mp")
    private double maxMp;
    @Column(name = "shield")
    private double shield;
    @Column(name = "defense")
    private double defense;
    @Column(name = "fire_resistance")
    private double fireResistance;
    @Column(name = "chill_resistance")
    private double chillResistance;
    @Column(name = "electric_resistance")
    private double electricResistance;
    @Column(name = "toxin_resistance")
    private double toxinResistance;
    @Column(name = "fire_skill_power")
    private double fireSkillPower;
    @Column(name = "chill_skill_power")
    private double chillSkillPower;
    @Column(name = "electric_skill_power")
    private double electricSkillPower;
    @Column(name = "toxin_skill_power")
    private double toxinSkillPower;
    @Column(name = "fusion_skill_power_modifier")
    private double fusionSkillPowerModifier;
    @Column(name = "singular_skill_power_modifier")
    private double singularSkillPowerModifier;
    @Column(name = "dimension_skill_power_modifier")
    private double dimensionSkillPowerModifier;
    @Column(name = "tech_skill_power_modifier")
    private double techSkillPowerModifier;
    @Column(name = "skill_critical_hit_rate")
    private double skillCriticalHitRate;
    @Column(name = "skill_critical_hit_damage")
    private double skillCriticalHitDamage;
    @Column(name = "skill_power")
    private double skillPower;
    @Column(name = "all_attribute_resistances")
    private double allAttributeResistances;
    @Column(name = "hp_regen_modifier")
    private double hpRegenModifier;
    @Column(name = "mp_regen_modifier")
    private double mpRegenModifier;
    @Column(name = "hp_heal")
    private double hpHeal;
    @Column(name = "skill_cooldown")
    private double skillCooldown;
    @Column(name = "skill_cost")
    private double skillCost;
    @Column(name = "skill_effect_range")
    private double skillEffectRange;
    @Column(name = "skill_duration")
    private double skillDuration;
    @Column(name = "skill_speed")
    private double skillSpeed;
    @Column(name = "critical_hit_resistance")
    private double criticalHitResistance;
    @Column(name = "skill_power_modifier")
    private double skillPowerModifier;


    @OneToMany(mappedBy = "characters", cascade = CascadeType.ALL)
    private List<BuildsModels> builds;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private EffectsModel effect;

    public CharactersModel(String name, Integer passiveEffects, Integer skill1, Integer skill2, Integer skill3, Integer skill4, double maxHp, double maxMp, double shield, double defense, double fireResistance, double chillResistance, double electricResistance, double toxinResistance, double fireSkillPower, double chillSkillPower, double electricSkillPower, double toxinSkillPower, double fusionSkillPowerModifier, double singularSkillPowerModifier, double dimensionSkillPowerModifier, double techSkillPowerModifier, double skillCriticalHitRate, double skillCriticalHitDamage, double skillPower, double allAttributeResistances, double hpRegenModifier, double mpRegenModifier, double hpHeal, double skillCooldown, double skillCost, double skillEffectRange, double skillDuration, double skillSpeed, double criticalHitResistance, double skillPowerModifier) {
        this.name = name;
        this.passiveEffects = passiveEffects;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
        this.skill4 = skill4;
        this.maxHp = maxHp;
        this.maxMp = maxMp;
        this.shield = shield;
        this.defense = defense;
        this.fireResistance = fireResistance;
        this.chillResistance = chillResistance;
        this.electricResistance = electricResistance;
        this.toxinResistance = toxinResistance;
        this.fireSkillPower = fireSkillPower;
        this.chillSkillPower = chillSkillPower;
        this.electricSkillPower = electricSkillPower;
        this.toxinSkillPower = toxinSkillPower;
        this.fusionSkillPowerModifier = fusionSkillPowerModifier;
        this.singularSkillPowerModifier = singularSkillPowerModifier;
        this.dimensionSkillPowerModifier = dimensionSkillPowerModifier;
        this.techSkillPowerModifier = techSkillPowerModifier;
        this.skillCriticalHitRate = skillCriticalHitRate;
        this.skillCriticalHitDamage = skillCriticalHitDamage;
        this.skillPower = skillPower;
        this.allAttributeResistances = allAttributeResistances;
        this.hpRegenModifier = hpRegenModifier;
        this.mpRegenModifier = mpRegenModifier;
        this.hpHeal = hpHeal;
        this.skillCooldown = skillCooldown;
        this.skillCost = skillCost;
        this.skillEffectRange = skillEffectRange;
        this.skillDuration = skillDuration;
        this.skillSpeed = skillSpeed;
        this.criticalHitResistance = criticalHitResistance;
        this.skillPowerModifier = skillPowerModifier;
    }
}
