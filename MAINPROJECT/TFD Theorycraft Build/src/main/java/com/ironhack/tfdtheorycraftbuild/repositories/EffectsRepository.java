package com.ironhack.tfdtheorycraftbuild.repositories;

import com.ironhack.tfdtheorycraftbuild.model.Effect;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EffectsRepository extends JpaRepository<Effect, Integer> {

    List<Effect> findByName(String name);
}
