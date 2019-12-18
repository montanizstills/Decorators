package com.github.nez;
import com.github.nez.dogs.*;

public class MainApplication {

    public static void main(String[] args){
        //good
        Dog goldenRetriever = new Dog(new GoldenRetrieverImplementation());
        System.out.println(goldenRetriever.bark());
        Dog chihuahua = new Dog(new ChihuahuaImplementation());
        System.out.println(chihuahua.bark());
        Dog confusedDog = new Dog();
        System.out.println(confusedDog.bark());
        confusedDog.changeDogType(new GoldenRetrieverImplementation());
        System.out.println(confusedDog.bark());


        //bad
       //Dog gr = new GoldenRetriever();
       //System.out.println(gr.bark());

    }
}
