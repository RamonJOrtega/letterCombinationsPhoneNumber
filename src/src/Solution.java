package src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }
        
        Map<Character, String> map = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        
        List<String> results = new ArrayList<String>();
        
        backtrack(digits, 0, new StringBuilder(), map, results);
        
        return results;
    }
    
    private void backtrack(String digits, int index, StringBuilder combination, Map<Character, String> map, List<String> results) {
        if (index == digits.length()) {
            results.add(combination.toString());
            return;
        }
        
        String letters = map.get(digits.charAt(index));
        
        for (int i = 0; i < letters.length(); i++) {
            combination.append(letters.charAt(i));
            backtrack(digits, index + 1, combination, map, results);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
