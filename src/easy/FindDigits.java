package easy;

import java.util.Scanner;

public class FindDigits {
    public void main() {
        Scanner in = new Scanner(System.in);
        int tests =  in.nextInt();
        for(int i = 0 ; i < tests ; i++) {
            int N = in.nextInt();
            int num = N;
            int count = 0;
            while(N>0) {
                int lastDigit = N%10;
                if(lastDigit != 0) {
                    if(num%lastDigit == 0)
                        count++;
                }
                N /= 10;
            }
            System.out.println(count);
        }
    }
}
