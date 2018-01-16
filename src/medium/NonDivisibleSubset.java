package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NonDivisibleSubset {

    public void main() {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] s = new int[n];
        HashMap<Integer, Integer> remainders = new HashMap<>();
        for(int i = 0 ; i < n ; i++) {
            s[i] = in.nextInt();
            int remainder = s[i] % k;

        }


        System.out.print(remainders);
    }







/*
        for(int i = 0 ; i < s.length-1 ; i++) {
            int num = s[i];
            for(int j = i + 1 ; j < s.length ; j++) {
                int num2 = s[j];
                int rem = (num + num2)%k;
                if(rem == 0) {
                    set.remove(num);
                }
            }
        }

        System.out.println(set.size());*/




    private void change(int key, int value, HashMap<Integer, Integer> map) {
        System.out.println("Key: " + key + " value: " + value);
    }
}
