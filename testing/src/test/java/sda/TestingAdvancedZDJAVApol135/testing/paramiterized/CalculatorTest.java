package sda.TestingAdvancedZDJAVApol135.testing.paramiterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import sda.TestingAdvancedZDJAVApol135.testing.tdd_exceptions_and_assertj.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

//    CSV = Comma Separated Value, 2 possible ways:
//    ====================================
//    1,"maciej",true
//    2,"michal",false
//    =====================================
//   id,name,isTall
//    1,"maciej",true
//    2,"michal",false


    @ParameterizedTest
    @CsvFileSource(resources = "calculator-add-params-test.csv")
    void whenAddTwoNumbersThenReturnSumOfThem(int x, int y, int expected){

//        given
        Calculator calculator = new Calculator();
//        when
        int result = calculator.add(x,y);
//        then
        assertEquals(expected, result);
    }



}
