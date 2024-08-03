package com.ironhack.hellolordofjpa.repository;


import com.ironhack.hellolordofjpa.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
    //    CharacterRepository
    //    Find characters by race
    //    Find characters by age range
    //    Find characters by name containing a specific keyword
    //    Find characters by race and age greater than a specific value

    //JPA Query Methods
    List<Character> findByRace(String race);

    List<Character> findByAgeGreaterThan(Integer age);

    List<Character> findByNameContaining(String name);

    List<Character> findByRaceAndAgeGreaterThan(String race, Integer age);

    //JPQL Query Methods


    //    Find characters by race
    @Query("SELECT c FROM Character c WHERE c.race = :race")
    List<Character> findByRaceJPQL(String race);

    //    Find characters by age range
    @Query("SELECT c FROM Character c WHERE c.age > :age")
    List<Character> FindByAgeGreaterThanJPQL(Integer age);

    //    Find characters by name containing a specific keyword
    @Query("SELECT c FROM Character c WHERE c.name LIKE %:name%")
    List<Character> FindByNameContainingJPQL(String name);

    //    Find characters by race and age greater than a specific value
    @Query("SELECT c FROM Character c WHERE c.race = :race AND c.age > :age")
    List<Character> FindByRaceAndAgeGreaterThanJPQL(String race, Integer age);




    //    Sample Data
    Character character1 = new Character(24000, "Human", "Gandalf");
    Character character2 = new Character(2931, "Elf", "Legolas");
    Character character3 = new Character(139, "Dwarf", "Gimli");

}



