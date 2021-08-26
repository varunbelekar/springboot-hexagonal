package com.hexagonal.adaptor.primary;

import com.hexagonal.domain.Cake;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CakeRestUI {
    @PostMapping
    void createCake(@RequestBody Cake cake);

    @GetMapping("/{cakeName}")
    Cake getCakeByName(@PathVariable String cakeName);

    @GetMapping
    List<Cake> getCakeList();
}
