package com.ironhack.tfdtheorycraftbuild.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table( name = "builds")
@NoArgsConstructor
@Entity
public class BuildsModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "builds_id")
    private Integer id;
    @Column(name = "character_id")
    private Integer character;
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


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "Characters_id")
    private CharactersModel characters;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "mods_id")
    private ModsModel mods;


}
