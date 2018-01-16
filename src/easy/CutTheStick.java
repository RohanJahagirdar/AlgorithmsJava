package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CutTheStick {
    public void main() {
        Scanner in = new Scanner(System.in);
        int sticks = in.nextInt();
        int [] lengths = new int[sticks];

        for(int i = 0 ; i < sticks ; i++)
            lengths[i] = in.nextInt();

        while(lengths.length >0) {
            lengths = reverseSelectionSort(lengths);
            System.out.println(lengths.length);
            lengths = cut(lengths, lengths[lengths.length - 1]);
        }
    }

    private int[] reverseSelectionSort(int[] in) {
        for(int i = 0 ; i < in.length-1 ; i++) {
            int index = i;
            for(int j = i+1 ; j < in.length ; j++)
                if(in[j] < in[index])
                    index = j;

            int smallestNUmber = in[index];
            in[index] = in[i];
            in[i] = smallestNUmber;
        }
        int[] rev = new int[in.length];
        int index = 0;
        for(int i = in.length-1 ; i >=0 ; i--) {
            rev[index] = in[i];
            index++;
        }
        return rev;
    }

    private int[] cut(int[] arr, int length) {
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = arr[i] - length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++)
            if(arr[i] > 0)
                list.add(arr[i]);
        return list.stream().mapToInt(i-> i).toArray();
    }
}
