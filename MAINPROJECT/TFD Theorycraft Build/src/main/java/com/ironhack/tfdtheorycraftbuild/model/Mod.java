package com.ironhack.tfdtheorycraftbuild.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "mods")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Mod {
    @Id
    @GeneratedValue( strategy = IDENTITY)
    @Column(name = "mods_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToOne(mappedBy = "mod")
    private Build build;


////////////////////////
    @ManyToMany(mappedBy = "modsUsed")
    private Set<Build> builds = new LimitedHashSet<>(8);
////////////////////////

    @ManyToMany
    @JoinTable(
            name = "mods_effects",
            joinColumns = @JoinColumn(name = "mods_id"),
            inverseJoinColumns = @JoinColumn(name = "effect_id")
    )
    private Set<Effect> effectMod = new HashSet<>();


}
