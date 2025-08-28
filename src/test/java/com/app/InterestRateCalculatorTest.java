package com.app;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class InterestRateCalculatorTest {

    InterestRateCalculator calculator = new InterestRateCalculator();
    int rate;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("This is before all!");
    }

    @BeforeEach
    public void beforeEach() {
        rate = 5;
        System.out.println("This is before each!");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("This is after each!");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("This is after all!");
    }

    @Test
    @Order(1)
    @DisplayName("Test method 2")
    public void testA() throws InterruptedException {
        System.out.println("A");
    }

    @Test
    @Order(2)
    @DisplayName("Test method 1")
    public void testB() {
        System.out.println("B");
    }

    @Test
    @Order(1)
    public void testC() {
        System.out.println("C");
    }

    @Test
    @Order(1)
    public void testD() {
        System.out.println("D");
    }
}
