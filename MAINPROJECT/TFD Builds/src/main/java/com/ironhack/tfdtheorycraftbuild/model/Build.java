package com.ironhack.tfdtheorycraftbuild.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@Table(name = "builds")
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@ValidCapacity
public class Build {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "builds_id")
    private Integer id;
    @Column(name = "build_name", length = 255)
    private String buildName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "character_id", referencedColumnName = "characters_id")
    private Character character;

    @Column(name = "max_capacity")
    @Min(value = 0, message = "Max capacity must be a positive value")
    private Integer maxCapacity;

    @Max(value = Integer.MAX_VALUE, message = "Current capacity cannot exceed max capacity")
    private Integer currentCapacity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mod_id", referencedColumnName = "mods_id")
    private Mod mod;

    @ManyToMany
    @JoinTable(
            name = "builds_mods",
            joinColumns = @JoinColumn(name = "builds_id"),
            inverseJoinColumns = @JoinColumn(name = "mods_id")
    )
    private Set<Mod> modsUsed = new LimitedHashSet<>(8);


    public void setCurrentCapacity(Integer currentCapacity) {
        if (mod != null) {
            this.currentCapacity = currentCapacity + mod.getCost();
        } else {
            this.currentCapacity = currentCapacity;
        }
    }

    public Build(String buildName, Character character, Integer maxCapacity, Integer currentCapacity, Set<Mod> modsUsed) {
        this.buildName = buildName;
        this.character = character;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
        this.modsUsed = modsUsed;
    }
}