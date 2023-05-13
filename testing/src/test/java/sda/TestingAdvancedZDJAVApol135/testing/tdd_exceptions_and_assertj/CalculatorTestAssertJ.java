package sda.TestingAdvancedZDJAVApol135.testing.tdd_exceptions_and_assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTestAssertJ {

    @Test
    void whenAddTwoNumbersThenReturnSumOfThemWithAssertJ(){

//        given
        Calculator calculator = new Calculator();
//        when
        int result = calculator.add(2,3);
//        then
        assertThat(result).isEqualTo(5);
        assertThat(result).isPositive();
        assertThat(result).isGreaterThan(4);

    }

//    Please test subtract method with AssertJ + exceptions if you want




}
