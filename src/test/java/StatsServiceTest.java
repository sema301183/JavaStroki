package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void testSum() {
        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testAverage() {
        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMax() {
        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSales(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMin() {
        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthAverageMax() {
        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthAverageMin(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthAverageMin() {
        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthAverageMin(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}