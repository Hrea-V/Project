package com.ironhack.tfdtheorycraftbuild.repositories;

import com.ironhack.tfdtheorycraftbuild.model.Mod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModsRepository extends JpaRepository<Mod, Integer> {

}
