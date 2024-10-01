abstract class car {
    public abstract void drive();
    public abstract void fly();

    //abstract method should be called no matter what in the normal class
    //abstract class should be called in normal class by extents keyword
    //when called in the main class should not be abstract
    //

    public void playMusic(){
        System.out.println("play music");
    }
}
abstract class WagonR extends car{
    public void fly(){
        System.out.println("flying");
    }
    public void drive(){
        System.out.println("Driving");
    }
    static class updatedWagonR extends WagonR{
        public void fly(){
            System.out.println("flying..");
        }
    }
}

public class Abstract47 {
    public static void main(String[] args) {
        car obj = new WagonR.updatedWagonR();
        obj.drive();;
        obj.playMusic();
        obj.fly();
    }
}
