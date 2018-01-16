package easy;

import java.util.Scanner;

public class SaveThePrisoner {
    public void main() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a = 0; a < t; a++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);


        }
    }
    private int saveThePrisoner(int n, int m, int s){
        return (s+m-2)%n +1;
    }

}
