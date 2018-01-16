package easy;

import java.util.Scanner;

public class MiniMaxSumJava {

    public  void main() {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }

        arr = bubbleSort(arr);

        long min = 0;
        long max = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(i < 4)
                min += arr[i];

            if(i>0)
                max+= arr[i];
        }

        System.out.println(min +  " " + max);

    }

    public long[] bubbleSort(long [] arr) {
        int length = arr.length;
        for(int i = 0 ; i < length -1 ; i++) {
            for(int j = 0 ; j < length-i-1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    long a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }

        return arr;
    }
}