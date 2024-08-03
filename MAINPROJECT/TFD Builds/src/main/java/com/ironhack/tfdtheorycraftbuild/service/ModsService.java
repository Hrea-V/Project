package com.ironhack.tfdtheorycraftbuild.service;

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

    //Get all mods
    public List<Mod> getMods() {
        log.info("Getting all mods");
        return modsRepository.findAll();
    }
    //add a new mod
    public void addMod(String name, String description, Integer cost)
    {
        log.info("Adding mod: " + name);
        modsRepository.save(new Mod(name, description, cost));
    }
    //Delete a mod
    public void deleteMod(Integer modId) {
        log.info("Deleting mod: " + modId);
        modsRepository.deleteById(modId);
    }


}