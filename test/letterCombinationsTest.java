package test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.Solution;

public class letterCombinationsTest {
    @Test
    public void testGetCombos() {
        String input = ("23");
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("ad");
        expectedOutput.add("ae");
        expectedOutput.add("af");
        expectedOutput.add("bd");
        expectedOutput.add("be");
        expectedOutput.add("bf");
        expectedOutput.add("cd");
        expectedOutput.add("cd");
        expectedOutput.add("cf");
        

        Solution solution = new Solution();
        List<String> result = solution.letterCombinations(input);
        assertEquals(expectedOutput, result);;

        
    }
}
