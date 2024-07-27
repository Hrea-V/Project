package com.ironhack.tfdtheorycraftbuild.repositories;

import com.ironhack.tfdtheorycraftbuild.model.CharactersModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharactersRepository extends JpaRepository<CharactersModel, Integer> {


}
