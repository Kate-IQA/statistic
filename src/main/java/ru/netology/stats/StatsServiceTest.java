package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void monthWithMaxSum() {
        StatsService service = new StatsService();
        int [] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.monthWithMaxSum(values);
        assertEquals(expected, actual);

    }
}