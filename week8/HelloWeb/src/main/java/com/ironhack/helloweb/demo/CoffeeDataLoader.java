package com.ironhack.helloweb.demo;

import com.ironhack.helloweb.model.Coffee;
import com.ironhack.helloweb.repository.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CoffeeDataLoader implements CommandLineRunner {
    private final CoffeeRepository coffeeRepository;


    @Override
    public void run(String... args) throws Exception {
        var coffeeList = List.of(
                new Coffee("Cappuccino", "Brazil", new BigDecimal("1.50")),
                new Coffee("Latte", "Italy", new BigDecimal("2.00")),
                new Coffee("Espresso", "France", new BigDecimal("1.00")),
                new Coffee("Americano", "USA", new BigDecimal("1.00")),
                new Coffee("Mocha", "USA", new BigDecimal("1.00")),
                new Coffee("Cafe", "USA", new BigDecimal("1.00"))
        );

        coffeeRepository.saveAll(coffeeList);
    }

}
