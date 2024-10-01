class Calc {
   final public void show(){
        System.out.println("in a calc show");
    }
    public void add(int n1 , int n2){
        System.out.println(n1+n2); //as now class is final, no one can extend it.
    }
    static class AdvCalc extends Calc{
//        public void show(){ //as final is used in show of Calc, we cannot use it AdvCalc
//            System.out.println("in a john show");
        }
    }
//}
public class FinalKeyword43 {
    public static void main(String[] args) {
//      final int num = 9;
//      num =2; //final num is 6 it cannot be changed
//      System.out.println(num);

        Calc.AdvCalc obj = new Calc.AdvCalc();
        obj.show();
        obj.add(3,5);


    }
}
