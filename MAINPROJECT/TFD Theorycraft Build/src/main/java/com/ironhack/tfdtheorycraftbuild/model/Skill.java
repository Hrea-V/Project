package com.ironhack.tfdtheorycraftbuild.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table( name = "skills")
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue( strategy = IDENTITY)
    @Column(name = "skills_id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description", length = 1024)
    private String description;
//////////////////////////
    @ManyToMany
    @JoinTable(
            name = "skills_effects",
            joinColumns = @JoinColumn(name = "skills_id"),
            inverseJoinColumns = @JoinColumn(name = "effect_id")
    )
    private Set<Effect> effectSkill = new HashSet<>();

    //////////////////////////////
    @ManyToMany(mappedBy = "skillsUsed")
    private Set<Character> character = new LimitedHashSet<>(5);
//////////////////////////////


}
