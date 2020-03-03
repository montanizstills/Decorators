package com.github.nez.animal.cage;

import com.github.nez.animal.AnimalInterface;

import java.util.List;

public class Cage <AnimalType extends AnimalInterface> {


    private List<AnimalType> dogList;

    public Cage(List<AnimalType> dogList) {
        this.dogList = dogList;
    }

    public void add(AnimalType animal){
        dogList.add(animal);
    }
}