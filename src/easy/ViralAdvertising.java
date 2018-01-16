package easy;

import java.util.Scanner;

public class ViralAdvertising {

    public void main() {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int likes = 5;
        int count = 0;
        for(int i = 0; i < days ; i++) {
            int dayLikes = likes/2;
            int newLikes = dayLikes*3;
            count += dayLikes;
            likes  = newLikes;
        }
        System.out.println(count);
    }

}
