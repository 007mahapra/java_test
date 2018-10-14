package question_a;

public class Parrot extends Bird{

    String livingNear,sound;

    Parrot(String livingNear,String sound){

        this.livingNear =livingNear;
        this.sound =sound;
    }

    @Override
    public void sing(){
        System.out.println("A parrot living with "+this.livingNear+" says...."+this.sound);
    }

}
