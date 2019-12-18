package com.github.nez.dogs;

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
}
