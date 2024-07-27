package com.ironhack.tfdtheorycraftbuild.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "effects")
@Entity
public class EffectsModel {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "effect_id")
    private Integer id;
    @Column(name="name")
    private String name;


    @OneToMany(mappedBy = "effect", cascade = CascadeType.ALL)
    private List<ModsModel> mods;
    @OneToMany(mappedBy = "effect", cascade = CascadeType.ALL)
    private List<CharactersModel> characters;
    @OneToMany(mappedBy = "effect", cascade = CascadeType.ALL)
    private List<SkillsModel> skills;


}
