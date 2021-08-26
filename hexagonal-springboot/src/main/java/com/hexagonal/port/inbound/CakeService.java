package com.hexagonal.port.inbound;

import com.hexagonal.domain.Cake;

import java.util.List;

public interface CakeService {
    public void createCake(Cake cake);

    public Cake getCake(String cakeName);

    public List<Cake> cakeList();
}
