package com.makotojava.learn.javanewscode3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * JUnit 5 (with JUnitPlatform.class)
 *
 */
@RunWith(JUnitPlatform.class)
@DisplayName("Testing using JUnit 5")
public class JUnit5AppTest {

  private App classUnderTest;

  @BeforeEach
  public void setUp() throws Exception {
    classUnderTest = new App();
  }

  @AfterEach
  public void tearDown() throws Exception {
    classUnderTest = null;
  }

  @Test
  public void testAdd() {
    //
    // Test #1
    long[] numbersToSum = { 1, 2, 3, 4 };
    long expectedSum = 10;
    long actualSum = classUnderTest.add(numbersToSum);
    assertEquals(expectedSum, actualSum);
    //
    // Test #2
    numbersToSum = new long[] { 20, 934, 110 };
    expectedSum = 1064;
    actualSum = classUnderTest.add(numbersToSum);
    assertEquals(expectedSum, actualSum);
    //
    // Test #3
    numbersToSum = new long[] { 2, 4, 6 };
    expectedSum = 12;
    actualSum = classUnderTest.add(numbersToSum);
    assertEquals(expectedSum, actualSum);
  }

  @Test
  public void testAdd_NegativeNumbers() {
    //
    // Test #1
    long[] numbersToSum = { -1, -2, -3, -4 };
    long expectedSum = -10;
    long actualSum = classUnderTest.add(numbersToSum);
    assertEquals(expectedSum, actualSum);
    //
    // Test #2
    numbersToSum = new long[] { -20, -934, -110 };
    expectedSum = -1064;
    actualSum = classUnderTest.add(numbersToSum);
    assertEquals(expectedSum, actualSum);
    //
    // Test #3
    numbersToSum = new long[] { -2, -4, -6 };
    expectedSum = -12;
    actualSum = classUnderTest.add(numbersToSum);
    assertEquals(expectedSum, actualSum);
  }

  @Test
  public void testAdd_SingleOperand() {
    long[] numbersToSum = { 1 };
    long expectedSum = 1;

    long actualSum = classUnderTest.add(numbersToSum);
    assertEquals(expectedSum, actualSum);
  }

  @Test()
  public void testAdd_ZeroOperands_EmptyArgument() {
    long[] numbersToSum = {};
    assertThrows(IllegalArgumentException.class, () -> classUnderTest.add(numbersToSum));
  }

  @Test
  public void testAdd_ZeroOperands_NullArgument() {
    long[] numbersToSum = null;
    Throwable expectedException = assertThrows(IllegalArgumentException.class,
        () -> classUnderTest.add(numbersToSum));
    assertEquals("Operands argument cannot be null", expectedException.getLocalizedMessage());
  }

}
