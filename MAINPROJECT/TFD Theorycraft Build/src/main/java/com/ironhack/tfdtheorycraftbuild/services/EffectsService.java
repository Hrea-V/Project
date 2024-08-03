package com.ironhack.tfdtheorycraftbuild.services;

import com.ironhack.tfdtheorycraftbuild.model.Effect;
import com.ironhack.tfdtheorycraftbuild.repositories.EffectsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EffectsService {
    private final EffectsRepository effectsRepository;

//    //Get all effects
//    public List<Effect> getEffects() {
//        log.info("Getting all effects");
//        return effectsRepository.findAll();
//    }
//    //Add a new effect
//    public void addEffect(String effectName) {
//        log.info("Adding effect: " + effectName);
//        Effect effect = new Effect(effectName);
//        effectsRepository.save(effect);
//    }
//    //Delete an effect
//    public void deleteEffect(Integer effectId) {
//        log.info("Deleting effect: " + effectId);
//        effectsRepository.deleteById(effectId);
//    }
}
