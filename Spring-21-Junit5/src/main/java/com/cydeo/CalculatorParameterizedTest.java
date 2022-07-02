package com.cydeo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorParameterizedTest {
    @ParameterizedTest
    @ValueSource(strings = {"abc1", "abc2"})
    @Tag("test1")
    void TestCase1(String args){
        System.out.println(args);
        assertTrue(args.contains("abc"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc1", "abc2"})
//    @EmptySource //empty string
//    @NullSource
    @NullAndEmptySource
    void TestCase2(String args){
        System.out.println(args);
        assertTrue(args.contains("abc"));
    }
    @ParameterizedTest
    @MethodSource("stringProvider")
    void TestCase3(String args){
        System.out.println(args);
        assertTrue(args.contains("abc"));
    }
    static String[] stringProvider(){
        return new String[]{"abc456", "hello", "jabc"};
    }

    @ParameterizedTest
    @CsvSource({"10,20", "3,4", "6,7"})
    void testCase5(int num1, int num2){
        assertEquals(30, Calculator.addNumbers(num1, num2));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testdata.csv", numLinesToSkip = 1)
    void testCase6(int num1, int num2, int result){
        assertEquals(result, Calculator.addNumbers(num1, num2));
    }


}
