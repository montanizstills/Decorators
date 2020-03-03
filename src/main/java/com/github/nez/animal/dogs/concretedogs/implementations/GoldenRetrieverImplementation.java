package com.github.nez.animal.dogs.concretedogs.implementations;

import com.github.nez.animal.dogs.DogInterface;

public class GoldenRetrieverImplementation implements DogInterface {

    //goldenRetriever can isAlive() but does not have an alive state. how can i check
    // Dog goldenRetriever = new Dog(new GoldenRetrieverImplementation).isAlive(), if isAlive() returns DogImplementation.alive ??
    // GoldenRetrieverImplementation is not an extension of DogImplementation so there is no field, i.e isAlive == falsy.

    @Override
    public String bark() {
        return "I am barking like a golden retriever...";
    }

    @Override
    public String sit() {
        return "I am sitting like a golden retriever...";
    }

    @Override
    public String run() {
        return "I am running like a golden retriever...";
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
