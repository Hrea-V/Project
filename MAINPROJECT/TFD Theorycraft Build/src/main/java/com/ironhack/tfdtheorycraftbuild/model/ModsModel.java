package com.ironhack.tfdtheorycraftbuild.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "mods")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class ModsModel {
    @Id
    @GeneratedValue( strategy = IDENTITY)
    @Column(name = "mods_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "mod_effect_1")
    private Integer modEffect1;
    @Column(name = "mod_value_1")
    private Double modValue1;
    @Column(name = "mod_effect_2")
    private Integer modEffect2;
    @Column(name = "mod_value_2")
    private Double modValue2;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "effect_id")
    private EffectsModel effect;

    public ModsModel(String name, String description, Integer cost, Integer modEffect1, Double modValue1, Integer modEffect2, Double modValue2) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.modEffect1 = modEffect1;
        this.modValue1 = modValue1;
        this.modEffect2 = modEffect2;
        this.modValue2 = modValue2;
    }
}
