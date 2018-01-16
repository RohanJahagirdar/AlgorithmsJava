package easy;

import java.util.Scanner;

public class AngryProfessorJava {

    public void main() {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();

        for(int i = 0 ; i< test ; i++) {
            int num = in.nextInt();
            int k = in.nextInt();
            int count = 0;
            for(int j = 0 ; j < num ; j++) {
               int late = in.nextInt();
                if(late > 0)
                    count++;
            }

            int remaining = num - count;

            if(remaining < k)
                System.out.println("YES");
            else
                 System.out.println("NO");
        }
    }

}
