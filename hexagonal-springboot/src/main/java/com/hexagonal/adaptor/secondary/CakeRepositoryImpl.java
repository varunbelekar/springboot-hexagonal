package com.hexagonal.adaptor.secondary;

import com.hexagonal.domain.Cake;
import com.hexagonal.port.outbound.CakeRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class CakeRepositoryImpl implements CakeRepository {
    private Map<String, Cake> cakeStore = new HashMap<>();

    @Override
    public void createCake(Cake cake) {
        cakeStore.put(cake.getName(), cake);
    }

    @Override
    public Cake getCake(String cakeName) {
        return cakeStore.get(cakeName);
    }

    @Override
    public List<Cake> getAllCakes() {
        return cakeStore.values().stream().collect(Collectors.toList());
    }
}
