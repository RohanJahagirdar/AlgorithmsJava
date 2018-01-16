package easy;

import java.util.Scanner;

public class SherlockAndSquares {

    public void main() {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();

        for(int test = 0 ; test < tests ; test++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int count = 0;

            for(int i = start ; i <= end ; i++) {
                if(isSquare(i))
                    count++;
            }
            System.out.println(count);
        }


    }

    public static boolean isSquare(int i) {
        double root = Math.sqrt(i);
        int rootInt = (int) root;
        return  root == rootInt;
    }
}
