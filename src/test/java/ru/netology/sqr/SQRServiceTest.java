package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'number of squares,test',200,300,3",
            "'number of squares,out of borders',0,99,0",
            "'number of squares,max in borders',100,10000,90"})
    void shouldNumberOfSquares(String testName, int minBorder, int maxBorder, int expected) {
        SQRService service = new SQRService();

        int actual = service.NumberOfSquares(minBorder, maxBorder);

        assertEquals(expected, actual);
    }


}