import java.util.*;

class Solution {
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone_map, output);
        return output;
    }

    private static void backtrack(String combination, String next_digits, String[] phone_map, List<String> output) {
        if (next_digits.isEmpty()) {
			System.out.println(combination);
            output.add(combination);
        } else {
            String letters = phone_map[next_digits.charAt(0) - '2'];
			System.out.println(letters);
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
            }
        }
    }
	
	public static void main(String[] args){
		List<String> ans = letterCombinations("23");
		
		System.out.println(ans);
	}
}