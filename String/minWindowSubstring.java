package test;

public class minWindowSubstring {

        public static String minWindow(String s, String t) {
            int slen = s.length();
            int tlen = t.length();

            if (slen < tlen) return "";

            int minI = -1;
            int minJ = slen;
            int i = 0;
            int j = tlen - 1;
            while (j < slen) {
                String sub = s.substring(i, j + 1);

                if (findLen(sub, t) == tlen) {
                    if (j - i < minJ - minI) {
                        minI = i;
                        minJ = j;
                    }
                    i++;
                } else {
                    j++;
                }
            }

            if (minI == -1) return "";

            return s.substring(minI, minJ + 1);
        }

        public static int findLen(String sub, String t) {
            int count = 0;
            int[] tCount = new int[128];

            for (char c : t.toCharArray()) {
                tCount[c]++;
            }

            for (char c : sub.toCharArray()) {
                if (tCount[c] > 0) {
                    count++;
                    tCount[c]--;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC")); // Expected output: "BANC"
    }
}
