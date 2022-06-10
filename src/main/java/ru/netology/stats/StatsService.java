package ru.netology.stats;

public class StatsService {
    int sumYearSales(int[] yearStatSales) {

        int sum = 0;
        for (int i : yearStatSales) {
            sum += i;
        }
        return sum;
    }

    int averageSalesMonth(int[] yearStatSales) {
        return sumYearSales(yearStatSales) / yearStatSales.length;
    }

    int minMonthSales(int[] yearStatSales) {
        int minSales = 0;
        int month = 0;
        for (int sale : yearStatSales) {
            if (sale <= yearStatSales[minSales]) {
                minSales = month;
            }
            month = month + 1;
        }
        return minSales + 1;
    }

    int maxMonthSales(int[] yearStatSales) {
        int maxSales = 0;
        int month = 0;
        for (int sale : yearStatSales) {
            if (sale >= yearStatSales[maxSales]) {
                maxSales = month;
            }
            month = month + 1;
        }
        return maxSales + 1;
    }

    int countLowerAvgSales(int[] yearStatSales) {
        int count = 0;
        int avg = averageSalesMonth(yearStatSales);
        for (int sale : yearStatSales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    int countUpperAvgSales(int[] yearStatSales) {
        int count = 0;
        int avg = averageSalesMonth(yearStatSales);
        for (int sale : yearStatSales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

}




