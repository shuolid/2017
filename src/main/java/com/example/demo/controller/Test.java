package com.example.demo.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(new BigDecimal("1.0000").intValue());
        System.out.println("58174-234588-000019901228001".length());
        System.out.println(UUID.randomUUID().toString().length());
    }
}

