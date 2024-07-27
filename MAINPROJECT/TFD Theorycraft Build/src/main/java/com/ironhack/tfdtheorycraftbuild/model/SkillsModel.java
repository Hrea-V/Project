package com.ironhack.tfdtheorycraftbuild.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table( name = "skills")
@Entity
@NoArgsConstructor
public class SkillsModel {
    @Id
    @GeneratedValue( strategy = IDENTITY)
    @Column(name = "skills_id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description", length = 1024)
    private String description;
    @Column(name = "skill_effect_1")
    private Integer skillEffect1;
    @Column (name = "skill_value_1")
    private double skillValue1;
    @Column(name = "skill_effect_2")
    private Integer skillEffect2;
    @Column(name = "skill_value_2")
    private double skillValue2;
    @Column(name = "skill_effect_3")
    private Integer skillEffect3;
    @Column(name = "skill_value_3")
    private double skillValue3;
    @Column(name = "skill_effect_4")
    private Integer skillEffect4;
    @Column(name = "skill_value_4")
    private double skillValue4;
    @Column(name = "skill_effect_5")
    private Integer skillEffect5;
    @Column(name = "skill_value_5")
    private double skillValue5;
    @Column(name = "skill_effect_6")
    private Integer skillEffect6;
    @Column(name = "skill_value_6")
    private double skillValue6;
    @Column(name = "skill_effect_7")
    private Integer skillEffect7;
    @Column(name = "skill_value_7")
    private double skillValue7;
    @Column(name = "skill_effect_8")
    private Integer skillEffect8;
    @Column(name = "skill_value_8")
    private double skillValue8;
    @Column(name = "skill_effect_9")
    private Integer skillEffect9;
    @Column(name = "skill_value_9")
    private double skillValue9;
    @Column(name = "skill_effect_10")
    private Integer skillEffect10;
    @Column(name = "skill_value_10")
    private double skillValue10;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "effect_id")
    private EffectsModel effect;


    public SkillsModel(String name, String description, Integer skillEffect1, double skillValue1, Integer skillEffect2, double skillValue2, Integer skillEffect3, double skillValue3, Integer skillEffect4, double skillValue4, Integer skillEffect5, double skillValue5, Integer skillEffect6, double skillValue6, Integer skillEffect7, double skillValue7, Integer skillEffect8, double skillValue8, Integer skillEffect9, double skillValue9, Integer skillEffect10, double skillValue10) {
        this.name = name;
        this.description = description;
        this.skillEffect1 = skillEffect1;
        this.skillValue1 = skillValue1;
        this.skillEffect2 = skillEffect2;
        this.skillValue2 = skillValue2;
        this.skillEffect3 = skillEffect3;
        this.skillValue3 = skillValue3;
        this.skillEffect4 = skillEffect4;
        this.skillValue4 = skillValue4;
        this.skillEffect5 = skillEffect5;
        this.skillValue5 = skillValue5;
        this.skillEffect6 = skillEffect6;
        this.skillValue6 = skillValue6;
        this.skillEffect7 = skillEffect7;
        this.skillValue7 = skillValue7;
        this.skillEffect8 = skillEffect8;
        this.skillValue8 = skillValue8;
        this.skillEffect9 = skillEffect9;
        this.skillValue9 = skillValue9;
        this.skillEffect10 = skillEffect10;
        this.skillValue10 = skillValue10;
    }
}
