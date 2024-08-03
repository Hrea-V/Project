package com.ironhack.hellolordofjpa.repository;

import com.ironhack.hellolordofjpa.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    //LocationRepository
    //Find locations by name
    //Find locations by description containing a specific keyword
    //Find locations by name starting with a specific prefix
    //Find locations by name, ignoring case

        //JPA Query Methods
    List<Location> findByName(String name);
    List<Location> findByDescriptionContaining(String description);
    List<Location> findByNameStartingWith(String name);
    List<Location> findByNameContainingIgnoreCase(String name);


    //Sample Data
    Location location1 = new Location("London", "Capital of England");
    Location location2 = new Location("Paris", "Capital of France");
    Location location3 = new Location("Berlin", "Capital of Germany");
}
