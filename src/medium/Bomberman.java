package medium;

import java.util.Scanner;

public class Bomberman {

    String[][] grid;
    String[][] copyGrid;

    int rows, columns;
    int seconds;
    int n = 0;
    public Bomberman() {
        process();
    }

    private void process() {
        Scanner in = new Scanner(System.in);
        rows  = in.nextInt();
        columns = in.nextInt();
        seconds = in.nextInt();

        grid = new String[rows][columns];
        copyGrid = new String[rows][columns];

        /*for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < columns ; j++) {
                grid[i][j] = 0;
            }
        }*/

        for(int i = 0 ; i < rows ; i++) {
            String input = in.next();

            for(int j = 0 ; j < columns ; j++) {
                if(String.valueOf(input.charAt(j)).equals(".")) {
                    grid[i][j] = ".";
                } else {
                    grid[i][j] = "0";
                }
            }
        }

        copyGrid = grid;

        n++;
        transform();
        detonate();

        for(int i = n ; i < seconds-1 ; i++) {
            transform();
            detonate();
        }


        print();
    }


    private void transform() {
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < columns ; j++) {
                String in = grid[i][j];
                if(in.equals(".")) {
                    copyGrid[i][j] = "0";
                }
            }
        }
        n++;
    }

    private void detonate() {
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < columns ; j++) {
                String in = grid[i][j];
                if(in.equals("0")) {
                    grid[i][j] = ".";
                    if(j > 0)
                        grid[i][j-1] = ".";

                    if(j+1 <= rows)
                        grid[i][j+1] = ".";

                    if(i > 0)
                        grid[i-1][j] = ".";

                    if(i+1 <= rows)
                        grid[i+1][j] = ".";
                }
            }
        }
        n++;
    }

    private void print() {
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < columns ; j++) {
                System.out.print(grid[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    public class testClass{

    }
}
