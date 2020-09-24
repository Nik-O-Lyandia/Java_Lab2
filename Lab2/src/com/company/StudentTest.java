package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class StudentTest {
    Student newStudent;

    @Test
    void inputTest() throws Exception {
        int[] errors = newStudent.Input("111", "222", "03.03.2000", "222", "222");
        System.out.println(errors[0]+errors[1]);
        assertArrayEquals(new int[] {0, 0}, errors);

    }
}