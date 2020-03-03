package com.github.nez.animal.dogs;

 public final class DogImplementation implements DogInterface {
     // to make life easier down the road I should make this DogImplementation abstract , but I don't wanna extend
     // ↓↓↓ how to do ?? ↓↓↓ , no way huh ??
     Boolean alive;

     public String bark() { return "I am barking like any dog..."; }

     public String sit() {
         return "I am barking like any dog...";
     }

     public String run() {
         return "I am king like any dog...";
     }

     @Override
     public Boolean hasLiveBirth() {
         return true;
     }

     @Override
     public Boolean isAlive() {
         return alive;
     }

 }

 //is this needed to set up the skeleton of future types of dog's implementation.
