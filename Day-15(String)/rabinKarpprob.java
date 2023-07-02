public class rabinKarpprob {
     private static final int PRIME = 101;
    public int repeatedStringMatch(String a, String b) {
        int m = b.length();
        int count = 1;
        StringBuilder sb = new StringBuilder(a);

        while (sb.length() < m) {
            sb.append(a);
            count++;
        }

        String text = sb.toString();
        if (text.equals(b))
            return count;
        if (rabin_karp(text, b, count) != -1)
            return count;
        if (rabin_karp(text + a, b, count + 1) != -1)
            return count + 1;
        return -1;
    }

    private int rabin_karp(String text, String b, int count) {
        if (text.length() == 0 || b.length() == 0)
            return -1;

        int m = b.length();
        int patternHash = calculateHash(b, m);
        int textHash = calculateHash(text, m);
        int n = text.length();

        for (int i = 0; i <= n - m; i++) {
            if (textHash == patternHash) {
                if (text.substring(i, i + m).equals(b)) {
                    return i;
                }
            }
            if (i < n - m) {
                textHash = recalculateHash(text, textHash, i, m);
            }
        }
        return -1;
    }
  
      private int calculateHash(String str, int length) {
        int hash = 0;
        for (int i = 0; i < length; i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private int recalculateHash(String str, int oldHash, int oldIndex, int patternLength) {
        int newHash = oldHash - str.charAt(oldIndex);
        newHash /= PRIME;
        newHash += str.charAt(oldIndex + patternLength) * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }
}
