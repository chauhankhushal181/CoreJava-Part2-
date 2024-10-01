@FunctionalInterface
interface H{
    void show();
}
//class I implements H{
//    public void show(){
//        System.out.println("in show");
//    }
//}
public class TypesOFInterfaces57 {
    public static void main(String[] args) {
        H obj = new H(){
            public void show(){
                System.out.println("in show");
            }
        };
        obj.show();
    }
}
