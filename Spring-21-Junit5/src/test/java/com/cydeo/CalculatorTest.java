package com.cydeo;

import org.junit.jupiter.api.*;

import java.nio.file.AccessDeniedException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCase1(){
        String nullString =null;
        String notNullString = "alljavadev";
        assertNotNull(notNullString);
        assertNull(nullString);
        assertNull(notNullString);

    }
    @Test
    void testCase2(){
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
    }
    @Test
    void testCase3(){
        Calculator c1=new Calculator();
        Calculator c3=c1;
        Calculator c2=new Calculator();
        assertNotSame(c1,c2);
        assertSame(c1,c3);
    }
    @Test
    void testCase4(){
    assertThrows(IllegalArgumentException.class, ()->Calculator.throwsMethod(3,2));
        assertThrows(AccessDeniedException.class, ()->Calculator.throwsMethod(3,2));
    }

    @Test
    void add(){
        int actual=Calculator.addNumbers(2,3);
        assertEquals(5, actual, "Not matching expected value");
    }

    @BeforeEach
    void setUpEach(){
        System.out.println("Runs before each method");
    }

    @AfterEach
    void tearDownEach(){
        System.out.println("After each method is executed");
    }

    @BeforeAll //must be static
    static void setUp(){
        System.out.println("Runs before all");
    }

    @AfterAll
    static void teardownAll(){
        System.out.println("Runs after all");
    }

}