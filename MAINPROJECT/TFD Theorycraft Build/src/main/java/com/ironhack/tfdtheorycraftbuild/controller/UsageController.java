package com.ironhack.tfdtheorycraftbuild.controller;

import com.ironhack.tfdtheorycraftbuild.model.Build;
import com.ironhack.tfdtheorycraftbuild.model.Character;
import com.ironhack.tfdtheorycraftbuild.model.Mod;
import com.ironhack.tfdtheorycraftbuild.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/builds")
@RequiredArgsConstructor
public class UsageController {
    private final BuildsService buildsService;

    //Get all builds
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Build> getBuilds() {
        return buildsService.getBuilds();
    }
    //Add a new build
    @PostMapping("/add/BuildName/{buildName}/CharacterId/{character}/MaxCapacity/{maxCapacity}/CurrentCapacity/{currentCapacity}/mod/{modsUsed}")
    @ResponseStatus(HttpStatus.CREATED)
    //String buildName, Integer characters, Integer maxCapacity, Integer currentCapacity, Integer mod1, Integer mod2, Integer mod3, Integer mod4, Integer mod5, Integer mod6, Integer mod7, Integer mod8
    public void addBuild(@PathVariable String buildName, @PathVariable Character character, @PathVariable Integer maxCapacity, @PathVariable Integer currentCapacity, @PathVariable Set<Mod> modsUsed) {
        buildsService.addBuild(buildName, character, maxCapacity, currentCapacity, modsUsed);
    }

    //Update a build
    @PutMapping("/update/{buildId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBuild(@PathVariable Integer buildId, @RequestBody Build build) {
        buildsService.updateBuild(buildId, build);
    }

    //Delete a build
    @DeleteMapping("/delete/{buildId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBuild(@PathVariable Integer buildId) {
        buildsService.deleteBuild(buildId);
    }


}
