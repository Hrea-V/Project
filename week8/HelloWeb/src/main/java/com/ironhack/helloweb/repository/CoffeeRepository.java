package com.ironhack.helloweb.repository;

import com.ironhack.helloweb.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {

    List<Coffee> findAllByOrigin(String name);

    List<Coffee> findAllByOriginIgnoreCaseAndNameIgnoreCase(String origin, String name);
}
