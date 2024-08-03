package com.ironhack.tfdtheorycraftbuild.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table( name = "characters")
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "characters_id")
    private Integer id;
    @Column(name = "name")
    private String name;

/////////////////////
    @JsonIgnore
    @OneToMany(mappedBy = "character")
    private Set<Build> builds = new HashSet<>();
/////////////////////
    @ManyToMany
    @JoinTable(
            name = "character_skill",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<Skill> skillsUsed = new LimitedHashSet<>(5);
    ///////////////////

    @ManyToMany
    @JoinTable(
            name = "character_effect",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "effect_id")
    )
    private Set<Effect> effectCharacter = new HashSet<>();
    ////////////////

}
