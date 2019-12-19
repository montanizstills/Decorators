package com.github.nez.animal.cage;

import com.github.nez.animal.AnimalInterface;

import java.util.List;

public class Cage <AnimalType extends AnimalInterface> {
    private List<AnimalType> dogList;

    public void add(AnimalType animal){
        this.add(animal);
    }
}