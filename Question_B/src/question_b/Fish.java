package question_b;

import question_a.Animal;
 public class Fish extends Animal {

     public Fish(){
         swim();
     }

    protected void swim() {
        System.out.println("Fish can swim.");
    }
}
