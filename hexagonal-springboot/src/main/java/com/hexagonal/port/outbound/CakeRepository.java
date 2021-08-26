package com.hexagonal.port.outbound;

import com.hexagonal.domain.Cake;

import java.util.List;

public interface CakeRepository {
    public  void createCake(Cake cake);

    public Cake getCake(String cakeName);

    public List<Cake> getAllCakes();
}
