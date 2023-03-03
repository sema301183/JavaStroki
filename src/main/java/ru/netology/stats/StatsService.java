package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        int totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;

    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        long maximumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                monthMaximum = i;
                maximumSale = sales[i];
            }
        }

        return monthMaximum + 1;
    }

    public int monthsBellowAverage(long[] sales){
        int counter = 0;
        long averageSale = average(sales)
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;

    }
}
            

