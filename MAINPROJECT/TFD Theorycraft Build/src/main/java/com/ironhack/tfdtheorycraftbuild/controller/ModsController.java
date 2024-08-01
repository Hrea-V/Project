package com.ironhack.tfdtheorycraftbuild.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ironhack.tfdtheorycraftbuild.model.ModsModel;
import com.ironhack.tfdtheorycraftbuild.services.ModsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mods")
@RequiredArgsConstructor
public class ModsController {
    private final ModsService modsService;

    //Get all mods
    @GetMapping("/all")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ResponseStatus(HttpStatus.OK)
    public List<ModsModel> getMods() {
        return modsService.getMods();
    }

    //Add a new mod
    @PostMapping("/add/{modName}/{description}/{cost}/{effect1}/{value1}/{effect2}/{value2}")
    @ResponseStatus(HttpStatus.CREATED)
    public void addMod(@PathVariable String modName, @PathVariable String description, @PathVariable Integer cost, @PathVariable Integer effect1, @PathVariable Double value1, @PathVariable Integer effect2, @PathVariable Double value2) {
        modsService.addMod(modName, description, cost, effect1, value1, effect2, value2);
    }

    //Delete a mod
    @DeleteMapping("/delete/{modId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMod(@PathVariable Integer modId) {
        modsService.deleteMod(modId);
    }
}
