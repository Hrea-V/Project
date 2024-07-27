package com.ironhack.tfdtheorycraftbuild.repositories;


import com.ironhack.tfdtheorycraftbuild.model.BuildsModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildsRepository extends JpaRepository<BuildsModels, Integer> {

}
