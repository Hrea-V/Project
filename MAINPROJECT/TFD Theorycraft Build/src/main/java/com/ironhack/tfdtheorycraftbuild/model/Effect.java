package com.ironhack.tfdtheorycraftbuild.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "effects")
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Effect {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "effect_id")
    private Integer id;


    @ManyToMany(mappedBy = "effectCharacter")
    private Set<Character> character = new HashSet<>();

    @ManyToMany(mappedBy = "effectMod")
    private Set<Mod> mod = new HashSet<>();

    @ManyToMany(mappedBy = "effectSkill")
    private Set<Skill> skill = new HashSet<>();

    @Column(name = "value")
    private Double value;


}
