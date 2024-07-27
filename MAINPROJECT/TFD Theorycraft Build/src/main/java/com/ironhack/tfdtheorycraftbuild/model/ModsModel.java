package com.ironhack.tfdtheorycraftbuild.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "mods")
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
    private double modValue1;
    @Column(name = "mod_effect_2")
    private Integer modEffect2;
    @Column(name = "mod_value_2")
    private double modValue2;

    @OneToMany(mappedBy = "mods", cascade = CascadeType.ALL)
    private List<BuildsModels> builds;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "effect_id")
    private EffectsModel effect;
}
