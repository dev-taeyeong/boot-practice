package org.example.service;

import org.example.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<>());

    @Test
    void name() {
        // given

        // when
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        // then
        assertEquals(List.of("1", "2", "3"), actual);
    }
}