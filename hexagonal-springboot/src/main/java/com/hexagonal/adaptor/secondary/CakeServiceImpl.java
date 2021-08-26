package com.hexagonal.adaptor.secondary;

import com.hexagonal.domain.Cake;
import com.hexagonal.port.inbound.CakeService;
import com.hexagonal.port.outbound.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeServiceImpl implements CakeService {
    @Autowired
    private CakeRepository cakeRepository;


    @Override
    public void createCake(Cake cake) {
        cakeRepository.createCake(cake);
    }

    @Override
    public Cake getCake(String cakeName) {
        return cakeRepository.getCake(cakeName);
    }

    @Override
    public List<Cake> cakeList() {
        return cakeRepository.getAllCakes();
    }
}
