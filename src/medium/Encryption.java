package medium;

public class Encryption {

    public Encryption(String input) {
        process(input);
    }

    private void process(String input) {
        int columns = (int)Math.ceil(Math.sqrt(input.length()));
        int rows = (int)Math.floor(Math.sqrt(input.length()));

        if(rows*columns < input.length()){ rows = columns;}

        for(int i = 0 ; i < columns ; i++) {
            for (int j = i; j < input.length(); j = j + columns) {
                System.out.print(input.charAt(j));
            }
            System.out.print(" ");
        }
    }
}