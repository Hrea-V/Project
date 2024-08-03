package com.ironhack.hellolordofjpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "character")
public class Character {
//Character: Represents a character from Lord of the Rings. It should have properties such as id, name, race, and age.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String race;
    private Integer age;

    public Character(Integer age, String race, String name) {
        this.age = age;
        this.race = race;
        this.name = name;
    }
}
