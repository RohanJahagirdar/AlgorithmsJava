package easy;

import java.util.Scanner;

public class LibraryFine {

    public void main() {
        Scanner in = new Scanner(System.in);
        int returnedDay = in.nextInt();
        int returnedMonth = in.nextInt();
        int returnedYear = in.nextInt();

        int expectedDay = in.nextInt();
        int expectedMonth = in.nextInt();
        int expectedYear = in.nextInt();

        int fine = 0;

        if( expectedYear > returnedYear || (returnedDay == expectedDay && expectedMonth== returnedMonth && returnedYear == expectedYear))
            System.out.println("0");
        else {
            if (expectedYear < returnedYear)
                System.out.println("10000");
            else {
                if(expectedMonth > returnedMonth) {
                    System.out.println(0);
                } else {
                    if (expectedMonth < returnedMonth)
                        System.out.println(500 * (returnedMonth - expectedMonth));
                    else {
                        if(expectedDay > returnedDay)
                            System.out.println(0);
                        else {
                            System.out.println(15 * (returnedDay - expectedDay));
                        }
                    }
                }
            }
        }



    }

}
