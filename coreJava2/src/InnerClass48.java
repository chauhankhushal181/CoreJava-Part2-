class G{
  int age;
  public void show(){
      System.out.println("in show");
  }

   static class H{
      public void Config(){
          System.out.println("in Config");
      }
  } //static can be used only for inner class
}
public class InnerClass48 {
    public static void main(String[] args) {
        G obj = new G();
        obj.show();

        G.H obj1 = new G.H();
        obj1.Config();
    }
}
