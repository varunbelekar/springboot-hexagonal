package com.hexagonal.adaptor.primary;

import com.hexagonal.domain.Cake;
import com.hexagonal.port.inbound.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cake")
public class CakeRestController implements  CakeRestUI{
    @Autowired
    private CakeService cakeService;

    @Override
    public void createCake(Cake cake) {
        cakeService.createCake(cake);
    }

    @Override
    public Cake getCakeByName(String cakeName) {
        return cakeService.getCake(cakeName);
    }

    @Override
    public List<Cake> getCakeList() {
        return cakeService.cakeList();
    }
}
