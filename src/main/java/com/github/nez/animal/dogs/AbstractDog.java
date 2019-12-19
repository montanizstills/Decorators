package com.github.nez.animal.dogs;

public class AbstractDog implements DogInterface {
    private  DogInterface dogInterface;
    private String tail;
    private Integer numberOfPaws;

    //specific type of dog
    public AbstractDog(DogInterface dogInterface){
        this.dogInterface=dogInterface;
    }

    public String bark() {
        return this.dogInterface.bark();
    }

    public String sit() {
        return this.dogInterface.sit();
    }

    public String run() {
        return this.dogInterface.run();
    }


    public void changeDogType(DogInterface newDogInterface){
        this.dogInterface=newDogInterface;
    }

    @Override
    public Boolean hasLiveBirth() {
        return this.dogInterface.hasLiveBirth();
    }

    @Override
    public Boolean isAlive() {
        return this.dogInterface.isAlive();
    }
}
