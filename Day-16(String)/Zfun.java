public class Zfun {

	public static int[] computeLPSArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int length = 0;
        int i = 1;
        lps[0] = 0;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
	public static int zAlgorithm(String s, String p, int n, int m) {
		// Write your code here
 		 int[] lps = computeLPSArray(p);
        int i = 0;
        int j = 0;
        int count=0;
        while (i < s.length()) {
            if (p.charAt(j) == s.charAt(i)) {
                i++;
                j++;
            }

            if (j == p.length()) {
                count++;
                j = lps[j - 1];
            } else if (i < s.length() && p.charAt(j) != s.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
		return count;
	}

}