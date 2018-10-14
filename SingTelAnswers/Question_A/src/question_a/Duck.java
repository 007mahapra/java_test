package question_a;

public class Duck extends Bird {

    @Override
    public void sing() {
        System.out.println("Duck says Quack, quack");
    }

    @Override
    public void swim(){
        System.out.println("Duck can swim..");
      }
}
