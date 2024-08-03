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


    //Get all builds
    public List<Build> getBuilds() {
        log.info("Getting all builds");
        return buildsRepository.findAll();
    }


}
