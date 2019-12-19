package com.github.nez;
import com.github.nez.cage.Cage;
import com.github.nez.dogs.*;

import java.util.List;

public class MainApplication {

    static Cage cage1 = new Cage();

    public static void main(String[] args){

        Cage<Dog> cage2 = new Cage();

        Dog goldenRetriever = new Dog(new GoldenRetrieverImplementation());
        System.out.println(goldenRetriever.bark());

        Dog chihuahua = new Dog(new ChihuahuaImplementation());
        System.out.println(chihuahua.bark());

        Dog confusedDog = new Dog();
        System.out.println(confusedDog.bark());

        confusedDog.changeDogType(new GoldenRetrieverImplementation());
        System.out.println(confusedDog.bark());

        cage1.add(chihuahua);
        cage2.add(goldenRetriever);

    }
}
