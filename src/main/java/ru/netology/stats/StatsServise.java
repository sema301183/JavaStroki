package ru.netology.stats;

public class StatsServise {

    public long sum(long[] sales) {
        long countSale = 0;
        for (long sale : sales) {
            countSale += sale;
        }
        return countSale;

    }

    public long average(long[] sales) {
        long totalSale = sum(sales);
        return sum(sales) / sales.length;


    }

    public int maxSales(long[] sales) {
        int monthMax = 0;
        long maxSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                monthMax = i;
                maxSales = sales[i];
            }
        }

        return monthMax + 1;
    }

    public int minSales(long[] sales) {
        int monthMin = 0;
        long minSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                monthMin = i;
                minSales = sales[i];
            }
        }

        return monthMin + 1;
    }

    public int monthAverageMin(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }

        }
        return counter;

    }

    public int monthAverageMax(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }

        }
        return counter;
    }
}