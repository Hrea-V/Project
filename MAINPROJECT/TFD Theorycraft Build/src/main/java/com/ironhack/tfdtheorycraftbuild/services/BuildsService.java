package com.ironhack.tfdtheorycraftbuild.services;

import com.ironhack.tfdtheorycraftbuild.model.Build;
import com.ironhack.tfdtheorycraftbuild.repositories.BuildsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BuildsService {
    private final BuildsRepository buildsRepository;

//    //Get all builds
//    public List<Build> getBuilds() {
//        log.info("Getting all builds");
//        return buildsRepository.findAll();
//    }
//
//    //Add a new build
//    public Build addBuild(String buildName, Integer characterId, Integer maxCapacity, Integer currentCapacity, Integer mod1, Integer mod2, Integer mod3, Integer mod4, Integer mod5, Integer mod6, Integer mod7, Integer mod8) {
//        log.info("Adding build: " + buildName);
//        return buildsRepository.save(new Build(buildName, characterId, maxCapacity, currentCapacity, mod1, mod2, mod3, mod4, mod5, mod6, mod7, mod8));
//    }
//
//    public void deleteBuild(Integer buildId) {
//        log.info("Deleting build: " + buildId);
//        buildsRepository.deleteById(buildId);
//    }
//
//    public void updateBuild(Integer buildId, Build build) {
//        log.info("Updating build: " + buildId);
//        buildsRepository.save(build);
//    }
}
