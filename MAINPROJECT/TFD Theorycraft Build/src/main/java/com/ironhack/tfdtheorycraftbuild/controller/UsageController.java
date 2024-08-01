package com.ironhack.tfdtheorycraftbuild.controller;

import com.ironhack.tfdtheorycraftbuild.model.BuildsModels;
import com.ironhack.tfdtheorycraftbuild.model.CharactersModel;
import com.ironhack.tfdtheorycraftbuild.model.ModsModel;
import com.ironhack.tfdtheorycraftbuild.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/builds")
@RequiredArgsConstructor
public class UsageController {
    private final BuildsService buildsService;

    //Get all builds
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<BuildsModels> getBuilds() {
        return buildsService.getBuilds();
    }
    //Add a new build
    @PostMapping("/add/{characterId}/{buildName}/{maxCapacity}/{currentCapacity}/{mod1}/{mod2}/{mod3}/{mod4}/{mod5}/{mod6}/{mod7}/{mod8}")
    @ResponseStatus(HttpStatus.CREATED)
    //String buildName, Integer characters, Integer maxCapacity, Integer currentCapacity, Integer mod1, Integer mod2, Integer mod3, Integer mod4, Integer mod5, Integer mod6, Integer mod7, Integer mod8
    public void addBuild(@PathVariable Integer characterId, @PathVariable String buildName, @PathVariable Integer maxCapacity, @PathVariable Integer currentCapacity, @PathVariable Integer mod1, @PathVariable Integer mod2, @PathVariable Integer mod3, @PathVariable Integer mod4, @PathVariable Integer mod5, @PathVariable Integer mod6, @PathVariable Integer mod7, @PathVariable Integer mod8) {
        buildsService.addBuild(buildName, characterId, maxCapacity, currentCapacity, mod1, mod2, mod3, mod4, mod5, mod6, mod7, mod8);
    }

    //Delete a build
    @DeleteMapping("/delete/{buildId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBuild(@PathVariable Integer buildId) {
        buildsService.deleteBuild(buildId);
    }


}
