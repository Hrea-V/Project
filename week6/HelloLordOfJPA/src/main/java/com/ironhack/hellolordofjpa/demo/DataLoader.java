package com.ironhack.hellolordofjpa.demo;

import com.ironhack.hellolordofjpa.model.Character;
import com.ironhack.hellolordofjpa.model.Location;
import com.ironhack.hellolordofjpa.repository.CharacterRepository;
import com.ironhack.hellolordofjpa.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private LocationRepository locationRepository;
    @Autowired
    private CharacterRepository characterRepository;


    @Override
    public void run(String... args) throws Exception {
        Character gandalf = new Character(24000, "Human", "Gandalf");
        Character legolas = new Character(2931, "Elf", "Legolas");
        Character gimli = new Character(139, "Dwarf", "Gimli");
        Character frodo = new Character(50, "Hobbit", "Frodo");

        var listOfCharacters = List.of(gandalf, legolas, gimli, frodo);
        characterRepository.saveAll(listOfCharacters);

        Location hobbiton = new Location("hobbiton", "The Hobbiton");
        Location orthanc = new Location("orthanc", "Orthanc");
        Location minasTirith = new Location("minasTirith", "Minas Tirith");
        Location shire = new Location("shire", "The Shire");
        Location rohan = new Location("rohan", "Rohan");
        Location rauros = new Location("rauros", "Rauros");
        Location mordor = new Location("mordor", "Mordor");

        var listOfLocations = List.of(hobbiton, orthanc, minasTirith, shire, rohan, rauros, mordor);
        locationRepository.saveAll(listOfLocations);

    }
}
