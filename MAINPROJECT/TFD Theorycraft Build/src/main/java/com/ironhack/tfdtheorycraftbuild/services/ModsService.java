package com.ironhack.tfdtheorycraftbuild.services;

import com.ironhack.tfdtheorycraftbuild.model.Mod;
import com.ironhack.tfdtheorycraftbuild.repositories.ModsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ModsService {
    private final ModsRepository modsRepository;

//    //Get all mods
//
//    public List<Mod> getMods() {
//        log.info("Getting all mods");
//        return modsRepository.findAll();
//    }
//    //Add a new mod
//
//    public void addMod(String modName, String description, Integer cost, Integer effect1, Double value1, Integer effect2, Double value2) {
//        log.info("Adding mod: " + modName);
//        modsRepository.save(new Mod(modName, description, cost, effect1, value1, effect2, value2));
//    }
//    //Delete a mod
//    public void deleteMod(Integer modId) {
//        log.info("Deleting mod: " + modId);
//        modsRepository.deleteById(modId);
//    }
}
