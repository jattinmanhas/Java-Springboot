package Junit;

import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {
    @BeforeAll
    public static void beforeAllFunction(){
        System.out.println("Before All");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("before each");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After each");
    }

    @AfterAll
    public static void afterAllFunction(){
        System.out.println("After All");
    }
}
