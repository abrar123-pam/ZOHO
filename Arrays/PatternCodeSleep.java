import java.util.HashMap;
import java.util.Map;

class PatternCodeSleep {
    public static boolean isMatch(String word, int i, String pattern, int j,
                                  Map<Character, String> map) {
        if (word == null || pattern == null || word.length() < pattern.length()) {
            return false;
        }

        int n = word.length(), m = pattern.length();

        if (n < m) {
            return false;
        }

        if (i == n && j == m) {
            return true;
        }

        if (i == n || j == m) {
            return false;
        }

        char curr = pattern.charAt(j);

        if (map.containsKey(curr)) {
            String s = map.get(curr);
            int k = s.length();

            String ss;
            if (i + k <= n) {
                ss = word.substring(i, i + k);
            } else {
                return false;
            }

            if (!ss.equals(s)) {
                return false;
            }

            return isMatch(word, i + k, pattern, j + 1, map);
        }

        for (int k = 1; k <= n - i; k++) {
            map.put(curr, word.substring(i, i + k));
			System.out.println(curr + ", " + word.substring(i, i + k));


            if (isMatch(word, i + k, pattern, j + 1, map)) {
                return true;
            }

            map.remove(curr);
        }

        return false;
    }

    public static void main(String[] args) {
        String word = "codesleepcode";
        String pattern = "XYX";

        Map<Character, String> mapping = new HashMap<>();
		for(Map.Entry<Character,String> map : mapping.entrySet()){
			
			System.out.println(map.getKey()+ " , " + map.getValue());
		}
        if (isMatch(word, 0, pattern, 0, mapping)) {
            System.out.println(mapping);
        } else {
            System.out.println("Solution doesn't exist");
        }
    }
}
