package medium;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public void main() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        BigInteger result = BigInteger.ONE;
        for(int i = 1 ; i <= num ; i++)
            result = result.multiply(BigInteger.valueOf(i));

        System.out.println(result);
    }


}
