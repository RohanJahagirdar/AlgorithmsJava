package easy;

import java.util.Scanner;

public class AppendAndDelete {
    public void main() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        System.out.println(check(s, t, k));
    }

    private String check(String s, String t, int k) {
        String commonString = "";
        for(int i = 0 ; i < s.length() ; i++) {
            if(t.length() < i)
                break;
            else {
                if (s.substring(0, i).equals(t.substring(0, i))) {
                    commonString = s.substring(0, i);
                }
            }
        }
        if((s.substring(commonString.length(), s.length()).length() + t.substring(commonString.length(), t.length()).length()) <= k) {
            return "YES";
        } else {
            return "NO";
        }




        /*


        public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		int k = sc.nextInt();
		System.out.println(solve(s, t, k) ? "Yes" : "No");

		sc.close();
	}

	static boolean solve(String s, String t, int k) {
		if (k >= s.length() + t.length()) {
			return true;
		}

		for (int i = s.length();; i--) {
			String prefixS = s.substring(0, i);
			if (t.startsWith(prefixS)) {
				int diff = (s.length() - i) + (t.length() - i);
				return diff <= k && (k - diff) % 2 == 0;
			}
		}
	}
         */
    }
}
