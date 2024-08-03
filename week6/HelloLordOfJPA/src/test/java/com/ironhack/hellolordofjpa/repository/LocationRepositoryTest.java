package com.ironhack.hellolordofjpa.repository;


import com.ironhack.hellolordofjpa.model.Location;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class LocationRepositoryTest {

    @Autowired
    private LocationRepository locationRepository;

    @BeforeEach
    void setUp() {
        locationRepository.deleteAll();

        Location location1 = new Location("London", "Capital of England");
        Location location2 = new Location("Paris", "Capital of France");
        Location location3 = new Location("Berlin", "Capital of Germany");

        locationRepository.saveAll(List.of(location1, location2, location3));
    }

    //Test the LocationRepository methods
    //
    //    findByName_ShouldReturnLocation_WhenNameExists
    //    findByDescriptionContaining_ShouldReturnLocations_WhenDescriptionContainsKeyword
    //    findByNameStartingWith_ShouldReturnLocations_WhenNameStartsWithPrefix
    //    findByNameIgnoreCase_ShouldReturnLocations_WhenNameMatches

    @Test
    void findByName_ShouldReturnLocation_WhenNameExists() {
        List<Location> location = locationRepository.findByName("London");
        assertEquals(1, location.size());
        assertEquals("London", location.get(0).getName());
    }


    @Test
    void findByDescriptionContaining_ShouldReturnLocations_WhenDescriptionContainsKeyword() {
        List<Location> locations = locationRepository.findByDescriptionContaining("Capital");
        assertEquals(3, locations.size());
    }


    @Test
    void findByNameStartingWith_ShouldReturnLocations_WhenNameStartsWithPrefix() {
        List<Location> locations = locationRepository.findByNameStartingWith("B");
        assertEquals(1, locations.size());
    }


    @Test
    void findByNameIgnoreCase_ShouldReturnLocations_WhenNameMatches() {
        List<Location> locations = locationRepository.findByNameContainingIgnoreCase("berlin");
        assertEquals(1, locations.size());
        assertEquals("Berlin", locations.get(0).getName());
    }


}
