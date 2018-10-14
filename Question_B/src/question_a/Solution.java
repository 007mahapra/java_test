package question_a;

import question_b.Clownfish;
import question_b.Dolphin;
import question_b.Fish;
import question_b.Shark;

import java.sql.SQLOutput;

public class Solution {

    public static void main(String[] args) throws Exception {


        //Solution to Singtel question number A - 1

        System.out.println("=========================Answers for Question A =======================================");
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();


        //Solution to Singtel Question number A -2
        Duck duck = new Duck();
        duck.sing();
        duck.swim();
        new ChickenAndRooster("rooster").sing();



        //Solution to Singtel Question number A -3
        //My Approach : Instead of defining  2 seperate class I'll use Parameterized Constructor within same class since they both have similar properties
        new ChickenAndRooster("chicken").sing();
        new ChickenAndRooster("rooster").sing();


        //Solution to Singtel Question number A -4
        //My Approach : Parameterized constructor

//        a. A parrot living with dogs says: “Woof, woof”
//        b. A parrot living with cats says: “Meow”
//        c. A parrot living near the rooster says: “Cock-a-doodle-doo”
//        d. Simply pass 2 parameter to Parrot class while instantiating
        new Parrot("dog","Woof , woof" ).sing();
        new Parrot("cat","Meow" ).sing();
        new Parrot("rooster","Cock-a-doodle-doo" ).sing();


        System.out.println("===================End of Answers for Question A =======================================\n\n\n");

        System.out.println("=========================Answers for Question B =======================================");

        //new Fish();
        //new Fish(new Shark());
        Fish fish = new Shark();
        Fish fish2 = new Clownfish();
        Dolphin dolphin = new Dolphin();



        System.out.println("===================End of Answers for Question B =======================================\n\n\n");














    }
}
