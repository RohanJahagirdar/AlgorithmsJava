package easy;

import java.util.Scanner;

public class BeautifulDay {

    public void main() {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        for(int it = i; it <= j ; it++) {

            int rev = reversed(it);

            int dif = it - rev;

            if(dif < 0)
                dif = -1*dif;


            if(dif%k ==0)
                count++;

        }
        System.out.println(count);

    }

    private int reversed(int x) {
        String str = String.valueOf(x);
        StringBuilder b = new StringBuilder();
        for(int i =  str.length() -1; i >= 0 ; i--) {
            b.append(str.charAt(i));
        }

        int rev = Integer.valueOf(b.toString());
        return rev;
    }

}
