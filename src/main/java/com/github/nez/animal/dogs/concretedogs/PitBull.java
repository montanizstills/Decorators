package com.github.nez.animal.dogs.concretedogs;

import com.github.nez.animal.dogs.AbstractDog;
import com.github.nez.animal.dogs.concretedogs.implementations.PitBullImplementation;

public class PitBull extends AbstractDog {
    public PitBull() {
        super(new PitBullImplementation());
    }
}