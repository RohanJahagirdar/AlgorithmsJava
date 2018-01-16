package medium;

public class LongestCommonSequence {

    public LongestCommonSequence(String a, String b) {
        System.out.println(process(a, b));
    }

    private int process(String a, String b){
        if(a == null || b == null || a.length() == 0 || b.length() == 0) {
            return 0;
        }
        int[][] matrix = new int[a.length() + 1][b.length() + 1];

        for(int i = 1 ; i <= a.length() ; i++ ) {
            for(int j = 1 ; j <= b.length() ; j++) {
                if(a.charAt(i - 1) == b.charAt(j-1)) {
                    matrix[i][j] =  matrix[i-1][j-1] + 1;
                } else {
                   // matrix[i][j] = Math.max
                }
            }

        }
        return 0;
    }
}
