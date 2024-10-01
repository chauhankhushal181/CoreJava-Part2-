@FunctionalInterface
interface H1{
    void show(int i);
}

//class I implements H{
//    public void show(){
//        System.out.println("in show");
//    }
//}

public class LambdaExperesson58 {
    public static void main(String[] args) {
        H1 obj = i -> System.out.println("in show" + i );
        obj.show(4);
    }
}
