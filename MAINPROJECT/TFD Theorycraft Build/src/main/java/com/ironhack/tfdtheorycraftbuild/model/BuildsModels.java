package com.ironhack.tfdtheorycraftbuild.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table( name = "builds")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class BuildsModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "builds_id")
    private Integer id;
    @Column(name = "build_name", length = 255)
    private String buildName;
    @Column(name = "character_id")
    private Integer characterId;
    @Column(name = "max_capacity")
    private Integer maxCapacity;
    @Column(name= "current_capacity")
    private Integer currentCapacity;

    @Column(name = "mod1")
    private Integer mod1;

    @Column(name = "mod2")
    private Integer mod2;

    @Column(name = "mod3")
    private Integer mod3;

    @Column(name = "mod4")
    private Integer mod4;

    @Column(name = "mod5")
    private Integer mod5;

    @Column(name = "mod6")
    private Integer mod6;

    @Column(name = "mod7")
    private Integer mod7;

    @Column(name = "mod8")
    private Integer mod8;

    @ManyToOne(fetch = FetchType.LAZY)
    private ModsModel modModel;

    @ManyToOne(fetch = FetchType.LAZY)
    private CharactersModel characters;

    public BuildsModels(String buildName, Integer characterId, Integer maxCapacity, Integer currentCapacity, Integer mod1, Integer mod2, Integer mod3, Integer mod4, Integer mod5, Integer mod6, Integer mod7, Integer mod8) {
        this.buildName = buildName;
        this.characterId = characterId;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
        this.mod1 = mod1;
        this.mod2 = mod2;
        this.mod3 = mod3;
        this.mod4 = mod4;
        this.mod5 = mod5;
        this.mod6 = mod6;
        this.mod7 = mod7;
        this.mod8 = mod8;
    }
}
