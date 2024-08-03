package com.ironhack.hellolordofjpa.repository;


import com.ironhack.hellolordofjpa.model.Character;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class CharacterRepositoryTest {

    @Autowired
    CharacterRepository characterRepository;

    @BeforeEach
    void setUp() {
        characterRepository.deleteAll();


        Character gandalf = new Character(24000, "Human", "Gandalf");
        Character legolas = new Character(2931, "Elf", "Legolas");
        Character gimli = new Character(139, "Dwarf", "Gimli");


        characterRepository.saveAll(List.of(gandalf, legolas, gimli));
    }

    //Test the CharacterRepository methods
    //
    //    findByRace_ShouldReturnCharacters_WhenRaceMatches
    //    findByAgeBetween_ShouldReturnCharacters_WhenAgeInRange
    //    findByNameContaining_ShouldReturnCharacters_WhenNameContainsKeyword
    //    findByRaceAndAgeGreaterThan_ShouldReturnCharacters_WhenRaceAndAgeMatch

    @Test
    void findByRace_ShouldReturnCharacters_WhenRaceMatches() {
        List<Character> characters = characterRepository.findByRace("Human");
        assertEquals(1, characters.size());
        assertEquals("Human", characters.get(0).getRace());
    }

    @Test
    void findByAgeBetween_ShouldReturnCharacters_WhenAgeInRange() {
        List<Character> characters = characterRepository.findByAgeGreaterThan(2000);
        assertEquals(2, characters.size());
    }

    @Test
    void findByNameContaining_ShouldReturnCharacters_WhenNameContainsKeyword() {
        List<Character> characters = characterRepository.findByNameContaining("G");
        assertEquals(2, characters.size());
    }

    @Test
    void findByRaceAndAgeGreaterThan_ShouldReturnCharacters_WhenRaceAndAgeMatch() {
        List<Character> characters = characterRepository.findByRaceAndAgeGreaterThan("Human", 2000);
        assertEquals(1, characters.size());
    }
    }
