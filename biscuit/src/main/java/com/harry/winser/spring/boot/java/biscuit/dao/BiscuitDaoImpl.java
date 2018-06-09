package com.harry.winser.spring.boot.java.biscuit.dao;

import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class BiscuitDaoImpl implements BiscuitDao {

    private Set<Biscuit> biscuitTin;

    public BiscuitDaoImpl() {

        Biscuit bourbons = new Biscuit(UUID.randomUUID().toString(),
                "Bourbons",
                "Chocolate Rectangles of brilliance. Good for tea time with family, friends, and or countdown");
        Biscuit digestives = new Biscuit(UUID.randomUUID().toString(),
                "Digestives",
                "While not strong on flavour, they are perfect for dunking. Recommended all year round.");
        Biscuit gingerSnaps = new Biscuit(UUID.randomUUID().toString(),
                "Ginger Snaps",
                "A fiery and powerful biscuit. Works well with tea in the evening on a cold winter night");


        biscuitTin = Set.of(bourbons, digestives, gingerSnaps);
    }

    @Override
    public Set<Biscuit> findAll() {

        return this.biscuitTin;
    }
}
