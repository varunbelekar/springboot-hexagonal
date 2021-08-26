package com.hexagonal.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Cake implements Serializable {
    private static final long serialVersionUID = 100000000L;
    private  String name;
}
