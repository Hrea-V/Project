package com.ironhack.tfdtheorycraftbuild.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ironhack.tfdtheorycraftbuild.model.Mod;
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
    public List<Mod> getMods() {
        return modsService.getMods();
    }

    //Add a new mod
    @PostMapping("/add/{name}/{description}/{cost}")
    @ResponseStatus(HttpStatus.CREATED)
    public void addMod(@PathVariable String name, @PathVariable String description, @PathVariable Integer cost) {
        modsService.addMod(name, description, cost);
    }

    //Delete a mod
    @DeleteMapping("/delete/{modId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMod(@PathVariable Integer modId) {
        modsService.deleteMod(modId);
    }
}
