package com.github.nez.animal.dogs.concretedogs.implementations;

import com.github.nez.animal.dogs.DogInterface;

public class ChihuahuaImplementation implements DogInterface {
    @Override
    public String bark() {
        return "my bark is really annoying...";
    }

    @Override
    public String sit() {
        return "I don't ever listen anyway";
    }

    @Override
    public String run() {
        return "I have small dog syndrome.";
    }

    @Override
    public Boolean hasLiveBirth() {
        return null;
    }

    @Override
    public Boolean isAlive() {
        return null;
    }
}
