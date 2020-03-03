package com.github.nez;
import com.github.nez.animal.cage.Cage;
import com.github.nez.animal.dogs.AbstractDog;
import com.github.nez.animal.dogs.DogImplementation;
import com.github.nez.animal.dogs.concretedogs.implementations.ChihuahuaImplementation;
import com.github.nez.animal.dogs.concretedogs.implementations.GoldenRetrieverImplementation;
import com.github.nez.animal.dogs.concretedogs.PitBull;


public class MainApplication {

    public static void main(String[] args){

        double a = 295.04;
        int b = 300;
        byte c = (byte) a;
        byte d = (byte) b;
        System.out.println(c + " " + d);

        //////////////////////////////////////

        AbstractDog confusedDog = new AbstractDog(new DogImplementation());
        System.out.println(confusedDog.bark());

//        confusedDog.changeDogType(new GoldenRetrieverImplementation());
//        System.out.println(confusedDog.bark());

        AbstractDog goldenRetriever = new AbstractDog(new GoldenRetrieverImplementation());
        System.out.println(goldenRetriever.tail);

        AbstractDog chihuahua = new AbstractDog(new ChihuahuaImplementation());
        System.out.println(chihuahua.bark());

        AbstractDog pitbull = new AbstractDog(new PitBull());
        System.out.println(pitbull.tail);

//        Cage<AbstractDog> cage2 = new Cage();
//        cage2.add(goldenRetriever);
//
//


    }
}
