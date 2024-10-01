class E{
    public void show(){
        System.out.println("in A show");
    }
    }

public class AnonymousInnerClass49 {
    public static void main(String[] args) {
        E obj = new E(){
            public void show(){
                System.out.println("in a new show");
            }
        };
        obj.show();

        }
    }
