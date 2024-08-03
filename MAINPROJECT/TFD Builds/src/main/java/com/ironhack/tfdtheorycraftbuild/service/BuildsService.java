package com.ironhack.tfdtheorycraftbuild.service;

import com.ironhack.tfdtheorycraftbuild.model.Build;
import com.ironhack.tfdtheorycraftbuild.model.Character;
import com.ironhack.tfdtheorycraftbuild.model.Mod;
import com.ironhack.tfdtheorycraftbuild.repositories.BuildsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class BuildsService {
    private final BuildsRepository buildsRepository;


    //Get all builds
    public List<Build> getBuilds() {
        log.info("Getting all builds");
        return buildsRepository.findAll();
    }
    //create a new build
    public void addBuild(String buildName, Character character, Integer maxCapacity, Integer currentCapacity, Set<Mod> modsUsed) {
        log.info("Adding build: " + buildName);
        buildsRepository.save(new Build(buildName, character, maxCapacity, currentCapacity, modsUsed));
    }
    //Delete a build
    public void deleteBuild(Integer buildId) {
        log.info("Deleting build: " + buildId);
        buildsRepository.deleteById(buildId);
    }


    //Update a build
    public void updateBuild(Integer buildId, Build build) {
        log.info("Updating build: " + buildId);
        buildsRepository.save(build);
    }
}