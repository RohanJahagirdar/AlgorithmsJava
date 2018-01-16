package easy;

import java.util.Scanner;

public class SequenceEquation {
    public void main() {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int [] pInverse = new int[length+1];
        for(int i = 1 ; i < pInverse.length ; i++) {
            int px = in.nextInt();
            pInverse[px] = i;
        }

        for(int i = 1 ; i < pInverse.length; i++) {
            int j = pInverse[pInverse[i]];
            System.out.println(j);
        }
    }

}
