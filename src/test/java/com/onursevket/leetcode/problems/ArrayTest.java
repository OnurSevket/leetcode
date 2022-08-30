package com.onursevket.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ArrayTest {

    private final Array array = new Array();

    @Test
    public void array_element_two_sum_successive_number() {
        //Arrange
        int[] numbers = new int[]{1, 5, 8};
        int targetNum = 6;
        //Act
        int[] sumOfNumber = array.twoSum(numbers, targetNum);
        //Assert
        assertArrayEquals(sumOfNumber, new int[]{0, 1});
    }

    @Test
    public void array_element_two_sum_not_successive_number() {
        //Arrange
        int[] numbers = new int[]{6, 1, 10, 5, 8, 100};
        int targetNum = 110;
        //Act
        int[] sumOfNumber = array.twoSum(numbers, targetNum);
        //Assert
        assertArrayEquals(sumOfNumber, new int[]{2, 5});
    }

    @Test
    public void array_element_two_sum_do_not_have() {
        //Arrange
        int[] numbers = new int[]{6, 9, 10, 21, 76, 111, 45};
        int targetNum = 122;
        //Act
        int[] sumOfNumber = array.twoSum(numbers, targetNum);
        //Assert
        assertNull(sumOfNumber);
    }
}