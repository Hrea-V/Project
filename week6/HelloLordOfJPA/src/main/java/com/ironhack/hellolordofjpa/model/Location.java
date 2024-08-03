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
@Table(name = "locations")
public class Location {
    //Location: Represents a location in Middle-earth. It should have properties such as id, name, and description.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
