interface C2{

    int age =44;
    String area="Mumbai";

    void show();
    void config();

}
class C3 implements A2 {
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}

public class WhatIsInterface52 {
    public static void main(String[] args) {
        A2 obj;
        obj = new A3();
        obj.show();
        obj.config();

//        C2.area="Mumbai";

        System.out.println(A2.area);
    }
}
