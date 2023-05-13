package sda.TestingAdvancedZDJAVApol135.testing.tdd_exceptions_and_assertj;

import org.junit.jupiter.api.Test;
import sda.TestingAdvancedZDJAVApol135.testing.exception.NumberIsTooBigException;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    @Test
    void whenAddTwoNumbersThenReturnSumOfThem(){

//        given
        Calculator calculator = new Calculator();
//        when
        int result = calculator.add(2,3);
//        then
        assertEquals(5, result);
        assertNotEquals(90, result);
    }

    @Test
    void whenSubtractTwoNumbersThenReturnDifferenceOfThem(){

//        given
        Calculator calculator = new Calculator();
//        when
        int result = calculator.subtract(10,3);
//        then
        assertEquals(7, result);
        assertNotEquals(90, result);

    }

    @Test
//    @Expected(IllegalArgumentException.class) -> JUnit4
    void whenSubtractTwoNumbersWhereYIsGreaterThanXThenIllegalArgumentExceptionIsThrown(){

//        given
        Calculator calculator = new Calculator();

        //        when + then
        assertThrows(IllegalArgumentException.class,
                () -> calculator.subtract(10, 20),
                "Y is greater than X");

        assertThrows(NumberIsTooBigException.class,
                () -> calculator.subtract(210, 20),
                "ByczQ, X is too big");
    }





}
