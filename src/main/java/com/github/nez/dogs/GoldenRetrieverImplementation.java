package com.github.nez.dogs;

public class GoldenRetrieverImplementation implements DogInterface {

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
