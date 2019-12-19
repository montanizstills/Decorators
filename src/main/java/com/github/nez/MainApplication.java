package com.github.nez;
import com.github.nez.animal.cage.Cage;
import com.github.nez.animal.dogs.AbstractDog;
import com.github.nez.animal.dogs.concretedogs.ChihuahuaImplementation;
import com.github.nez.animal.dogs.concretedogs.GoldenRetrieverImplementation;


public class MainApplication {

    static Cage cage1 = new Cage();

    public static void main(String[] args){

        Cage<AbstractDog> cage2 = new Cage();

        AbstractDog goldenRetriever = new AbstractDog(new GoldenRetrieverImplementation());
        System.out.println(goldenRetriever.bark());

        AbstractDog chihuahua = new AbstractDog(new ChihuahuaImplementation());
        System.out.println(chihuahua.bark());

        AbstractDog confusedDog = new AbstractDog();
        System.out.println(confusedDog.bark());

        confusedDog.changeDogType(new GoldenRetrieverImplementation());
        System.out.println(confusedDog.bark());

        cage1.add(chihuahua);
        cage2.add(goldenRetriever);


        AbstractDog pitbull = new AbstractDog(new PitBull());

    }
}
