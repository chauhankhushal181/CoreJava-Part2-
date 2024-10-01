class A1{
    public void show(){
        System.out.println("in a show");
    }
     static class B1 extends A1{
        public void show2(){
            System.out.println("in a b show");
        }
    }
}
public class UpCastingAndDownCasting45 {
    public static void main(String[] args) {
        A1 obj = new A1.B1();
        obj.show();


    }
}
