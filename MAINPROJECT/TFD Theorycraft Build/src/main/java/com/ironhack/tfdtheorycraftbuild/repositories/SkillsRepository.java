package com.ironhack.tfdtheorycraftbuild.repositories;

import com.ironhack.tfdtheorycraftbuild.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillsRepository extends JpaRepository<Skill, Integer> {

    List<Skill> findAllByName(String name);
}
