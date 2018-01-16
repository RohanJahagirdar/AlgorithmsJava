package easy;

import java.util.Scanner;

public class TimeConversionJava {

    public void main() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

    String timeConversion(String s) {
        String apOrPm = s.substring(s.length()-2, s.length());
        if(apOrPm.equals("AM"))
            return s;

        String hours = s.substring(s.length()-10, s.length()-8);
        int hoursInt = Integer.parseInt(hours);
        hoursInt += 12;
        String ret = hoursInt+ ":" + s.substring(s.length()-7, s.length()-2);
        return ret;
    }
}
