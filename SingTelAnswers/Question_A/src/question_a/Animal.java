package question_a;

public class Animal implements AnimalInterface  {

    @Override
    public void walk() {
        System.out.println("I'm walking");
    }
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
    @Override
    public void sing() {
        System.out.println("I am singing");
    }

    public void swim(){
        System.out.println("I am swimming");
    }
}
