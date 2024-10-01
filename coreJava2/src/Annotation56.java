
class N {
    @Deprecated
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in sn show");
    }
}
class M extends N{
    @Override //Annotation
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in m show ");
    }
}

public class Annotation56 {
    public static void main(String[] args) {
        M obj = new M();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
