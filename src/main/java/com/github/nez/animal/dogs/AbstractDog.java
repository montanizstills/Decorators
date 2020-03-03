package com.github.nez.animal.dogs;

public class AbstractDog implements DogInterface {

    private  DogInterface dogInterface;
    public String tail="my tail";
    public String paws;


//  specific type of dog
    public AbstractDog(DogInterface dogInterface){
        this.dogInterface=dogInterface;
    }

//    killed --> cannot instantiate abstract dog. What is an AbstractDog, that is what is a dog?
//    kill this nullary constructor, allows for "emptyDog" construction.
//    public AbstractDog(){this(new DogImplementation());}

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
