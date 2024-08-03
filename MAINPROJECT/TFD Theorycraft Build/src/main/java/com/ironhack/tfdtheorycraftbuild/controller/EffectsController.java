package com.ironhack.tfdtheorycraftbuild.controller;

import com.ironhack.tfdtheorycraftbuild.model.Effect;
import com.ironhack.tfdtheorycraftbuild.services.EffectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/effects")
@RequiredArgsConstructor
public class EffectsController {
    private final EffectsService effectsService;
//
//    //Get all effects
//    @GetMapping("/all")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Effect> getEffects() {
//        return effectsService.getEffects();
//    }
//    //Add a new effect
//    @PostMapping("/add/{effectName}")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void addEffect(@PathVariable String effectName) {
//        effectsService.addEffect(effectName);
//    }
//
//    //Delete an effect
//    @DeleteMapping("/delete/{effectId}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteEffect(Integer effectId) {
//        effectsService.deleteEffect(effectId);
//    }


}
