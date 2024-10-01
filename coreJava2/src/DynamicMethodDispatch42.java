import java.awt.*;

class Computer{

}
class Laptop extends Computer{

}
class A{
    public void show(){
        System.out.println("In A show");
    }
    static class B extends A{
        public void show(){
            System.out.println("In B show");
        }
    }
    static class C extends B{
        public void show(){
            System.out.println("In c show");
        }
    }
}
public class DynamicMethodDispatch42 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new A.B();
        obj.show();

        obj = new A.C();
        obj.show();



    }
}
