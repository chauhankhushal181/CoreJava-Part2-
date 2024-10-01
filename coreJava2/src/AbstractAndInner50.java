abstract class z{
    public abstract void show();
    public abstract void Config();
    }

public class AbstractAndInner50 {
    public static void main(String[] args) {
        z obj = new z() {
            @Override
            public void show() {
                System.out.println("in a new show");
            }

            @Override
            public void Config() {
                System.out.println("in Config");
            }
        };
        obj.show();
        obj.Config();

    }
}
