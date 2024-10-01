//class - class --> extends
//class - interface -> implements
// interface - interface -> extends

interface A2 {

    int age =44;
    String area="Mumbai";

    void show();
    void config();
}
interface x{
    void run();
}
interface y extends x{
    @Override
    void run();
}

class A3 implements A2,x {
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }
}

public class MoreOnInterface53 {
    public static void main(String[] args) {
        A2 obj;
        obj = new A3();
        obj.show();
        obj.config();

        x obj1 = new A3();
        obj1.run();

//        C2.area="Mumbai";

        System.out.println(A2.area);
    }
}
