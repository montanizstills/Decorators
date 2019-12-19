package com.github.nez.dogs;

public class Dog implements DogInterface {

    private Boolean alive;
    private  DogInterface dogInterface;
    private String tail;
    private Integer numberOfPaws;


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

    public void changeDogType(DogInterface newDogInterface){
        this.dogInterface=newDogInterface;
    }

    @Override
    public Boolean hasLiveBirth() {
        return true;
    }

    @Override
    public Boolean isAlive() {
        //return the DogImplementation.alive, bc Dog is just a wrapper class, dog will never "exist", just a DogImplementation wearing a costume
        //return super.alive;
        return alive;
    }
}
