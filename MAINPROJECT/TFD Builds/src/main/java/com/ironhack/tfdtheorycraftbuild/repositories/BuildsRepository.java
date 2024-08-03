package com.ironhack.tfdtheorycraftbuild.repositories;


import com.ironhack.tfdtheorycraftbuild.model.Build;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildsRepository extends JpaRepository<Build, Integer> {

}