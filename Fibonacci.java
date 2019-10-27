import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        int num = 100;
        String str = "";
        String result = "1";

       for(int i = 0; i<num-1; i++){
           BigInteger c = a.add(b);
           str = str + c + " ";
           a = b;
           b = c;
       }

        result = result + " " + str;
        System.out.println(result);
    }
}
