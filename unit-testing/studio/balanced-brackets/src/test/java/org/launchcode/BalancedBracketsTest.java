package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test // test 1
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }
    @Test // test 2
    public void bracketsBeforeCharacters () {
        String message = "a set of balanced brackets before characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test // test 3
    public void noBracketsReturnsTrue() {
        String message = "empty string returns true";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, testData);
    }
    @Test // test 4
    public void messageWithinBracketsReturnsTrue() {
        String message = "characters inside of brackets returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, testData);
    }
    @Test // test 5
    public void bracketsAmongOtherCharacters() {
        String message = "balanced brackets among other characters returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test // test 6
    public void quadBalancedBrackets() {
        String message = "four consecutive pairs of balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test // test 7
    public void nestedBalancedBrackets() {
        String message = "multiple pairs of nested balanced brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test // test 8
    public void singleOpeningBracket() {
        String message = "a single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test // test 9
    public void singleClosingBracket() {
        String message = "a single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test // test 10
    public void invertedBrackets() {
        String message = "an inverted pair of brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test // test 11
    public void invertedBracketsAmongOtherCharacters() {
        String message = "an inverted pair of brackets returns false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test // test 12
    public void singleOpenBracketBeforeCharacters() {
        String message = "a single opening bracket before characters returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test // test 13
    public void singleCloseBracketBeforeCharacters() {
        String message = "a single closing bracket before characters returns false";
        String testData = "]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test // test 14
    public void messageWithoutBrackets() {
        String message = "characters without brackets returns true";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, testData);
    }
    @Test // test 15
    public void multipleOpenBracketsSingleClose() {
        String message = "multiple opening brackets with a single closed returns false";
        String testData = "[[[[[[[[][[[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, testData);
    }
}