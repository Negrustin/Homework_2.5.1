package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatusServiceTest {

    @Test
    public void sumYearSalesTest() {
        StatsService service = new StatsService();

        int[] statSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumYearSales(statSale);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesMonthTest() {
        StatsService service = new StatsService();

        int[] statSale = {3, 12, 7, 11, 23, 11, 6, 28, 11, 16, 18, 22};

        int exceptedAvg = 14;
        int actualAvg = service.averageSalesMonth(statSale);

        Assertions.assertEquals(exceptedAvg, actualAvg);
    }

    @Test
    public void minMonthSalesTest() {
        StatsService service = new StatsService();

        int[] statSale = {12, 41, 5, 32, 17, 20, 19, 5, 7, 7, 31, 15};

        int exceptedMinMonth = 8;
        int actualMinMonth = service.minMonthSales(statSale);

        Assertions.assertEquals(exceptedMinMonth, actualMinMonth);

    }

    @Test
    public void maxMonthSalesTest() {
        StatsService service = new StatsService();

        int[] statSale = {6, 21, 13, 32, 8, 20, 30, 20, 7, 32, 12, 28};

        int exceptionMaxMonth = 10;
        int actualMaxMonth = service.maxMonthSales(statSale);

        Assertions.assertEquals(exceptionMaxMonth, actualMaxMonth);
    }

    @Test
    public void countLowerAvgSalesTest() {
        StatsService service = new StatsService();

        int[] statSale = {23, 22, 31, 16, 30, 18, 20, 14, 33, 24, 20, 13};

        int exceptedCountLowerAvgSales = 6;
        int actualCountLowerAvgSales = service.countLowerAvgSales(statSale);

        Assertions.assertEquals(exceptedCountLowerAvgSales, actualCountLowerAvgSales);
    }

    @Test
    public void countUpperAvgSalesTest() {
        StatsService service = new StatsService();

        int[] statSale = {23, 22, 31, 16, 30, 18, 20, 14, 33, 24, 20, 13};

        int exceptionUpperSales = 5;
        int actualUpperSales = service.countUpperAvgSales(statSale);

        Assertions.assertEquals(exceptionUpperSales, actualUpperSales);

    }

}
