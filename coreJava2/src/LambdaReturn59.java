interface H3{
    int add(int i , int j);
}



public class LambdaReturn59 {
    public static void main(String[] args) {
        H3 obj = (i,j) -> i+j;

            int result = obj.add(3, 4);
            System.out.println(result);
        }
    } //lambda with return and functional interface
