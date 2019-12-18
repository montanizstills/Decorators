package com.github.nez.dogs;

public class Dog implements DogInterface {

    private  DogInterface dogInterface;

    public Dog(){
        this(new DogImplementation());
    }

    //Kill two birds with one stone making two constructors without a parameter and with different interfaces.

    public Dog(DogInterface dogInterface){
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

    public void changeBark(DogInterface newBarker){
        this.dogInterface = newBarker;
    }

    public void changeDogType(DogInterface newDogInterface){
        this.dogInterface=newDogInterface;
    }
}
