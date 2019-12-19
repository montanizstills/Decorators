package com.github.nez.cage;

import com.github.nez.dogs.AnimalInterface;
import java.util.List;

public class Cage <AnimalType extends AnimalInterface> {
    private List<AnimalType> dogList;

    public void add(AnimalType animal){
        this.add(animal);
    }
}