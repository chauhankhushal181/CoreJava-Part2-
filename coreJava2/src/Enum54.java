enum Status{
    Running, Failed , Pending ,Success;

}
public class Enum54 {
    public static void main(String[] args) {
        int i =5;
        status[] ss = status.values();
//      Status s = Status.Running;
//      Status s = Status.Failed;
        status s1 = status.Pending;
        System.out.println(ss[0]);

        for (status s : ss){
            System.out.println(s + " : " + s.ordinal());
        }
    }
}
