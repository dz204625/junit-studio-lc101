package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void bracketOnTheBothSide() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketInSideTheText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketInFrontOfText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void twoNestedBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void oneRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void twoRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode"));
    }

    @Test
    public void closeAndOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void oneLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void twoLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]]"));
    }


    @Test
    public void NestedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]]"));
    }

    @Test
    public void multiNestedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch[[[[[[Code]]]"));
    }














}
