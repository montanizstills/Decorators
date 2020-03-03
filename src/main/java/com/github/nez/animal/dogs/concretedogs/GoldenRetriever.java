package com.github.nez.animal.dogs.concretedogs;

import com.github.nez.animal.dogs.AbstractDog;
import com.github.nez.animal.dogs.DogInterface;
import com.github.nez.animal.dogs.concretedogs.implementations.GoldenRetrieverImplementation;

public class GoldenRetriever extends AbstractDog {
    public GoldenRetriever(DogInterface dogInterface) {
        super(dogInterface);
    }
    public GoldenRetriever(){
        super (new GoldenRetrieverImplementation());
    }
}
