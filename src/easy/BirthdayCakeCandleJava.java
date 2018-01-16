package easy;

import java.util.HashMap;
import java.util.Scanner;

public class BirthdayCakeCandleJava {

    long largest = 0;
    private int birthdayCakeCandles(int n, long[] ar) {
        return printRequirment(ar);
        // Complete this function
    }

    public void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];

        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
            if(largest <= ar[ar_i])
                largest = ar[ar_i];

        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

    private int printRequirment(long [] arr) {
        int count = 0;
        long maxNum = largest;
        for(int i = 0 ; i <arr.length ; i++) {
            if(arr[i] == maxNum)
                count++;
        }

        return count;
    }
}
