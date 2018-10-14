package question_a;

public class ChickenAndRooster extends Bird{

    String birdType;

    ChickenAndRooster(String type){

        if(type.equalsIgnoreCase("chicken")){
            this.birdType ="chicken";

        }else if(type.equalsIgnoreCase("rooster")){
            this.birdType ="rooster";
        }else {
            this.birdType ="wrong";
        }
    }

    @Override
    public void sing(){

        if (this.birdType.equalsIgnoreCase("chicken")){
            System.out.println("Chicken says ..Cluck Cluck");
        }else if(this.birdType.equalsIgnoreCase("rooster")){
            System.out.println("Rooster says ..Cock-a-doodle-doo");
        }else {
            System.out.println("Wrong bird type");
        }
    }
}
