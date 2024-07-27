package com.ironhack.tfdtheorycraftbuild.services;

import com.ironhack.tfdtheorycraftbuild.repositories.ModsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ModsService {
    private final ModsRepository modsRepository;

}
