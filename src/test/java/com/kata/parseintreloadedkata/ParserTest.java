package com.kata.parseintreloadedkata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParserTest {

    private static Stream<Arguments> numberToMonth() {
        return Stream.of(
                arguments("zero", 0),
                arguments("seven hundred eighty-three thousand nine hundred and nineteen", 783919),
                arguments("twelve", 12),
                arguments("one million", 1_000_000)
        );
    }

    @ParameterizedTest
    @MethodSource("numberToMonth")
    void test(String test, int expected) {
        // Act
        int actual = Parser.parseInt(test);

        // Assert
        assertEquals(expected, actual);
    }
}
