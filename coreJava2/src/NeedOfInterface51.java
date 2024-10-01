interface B1 {
    void code();
}

class C1 implements B1 {
    public void code(){
        System.out.println("code , compile, run");
    }
}

class D1 extends C1 {
    public void code(){
        System.out.println("code , compile, run :  faster");
    }
}

class Developer {
    public void devApp(B1 computer){
        computer.code();
    }
}

public class NeedOfInterface51 {
    public static void main(String[] args) {
        B1 computer = new C1();
        B1 desktop = new D1();


        Developer navin = new Developer();
        navin.devApp(desktop);
    }
}
