package easy;

import java.util.Scanner;

public class JumpingOnClouds {

    public void main() {
        Scanner in = new Scanner(System.in);
        int clouds = in.nextInt();
        int jumps = in.nextInt();
        int energy = 100;
        int[] energyLevels = new int[clouds];
        for(int i = 0 ; i < clouds ; i++)
            energyLevels[i] = in.nextInt();
        boolean stop = false;
        int currentCloud = 0;
        while(!stop) {
            currentCloud = currentCloud + jumps;
            if(currentCloud >=clouds) currentCloud = currentCloud%clouds;
            switch (energyLevels[currentCloud]) {
                case 0:
                    energy = energy - 1;
                    break;
                case 1:
                    energy = energy - jumps - 1;
                    break;
            }
            if(energy == 0 || currentCloud == 0)
                stop = true;
        }
        System.out.println(energy);
    }
}
