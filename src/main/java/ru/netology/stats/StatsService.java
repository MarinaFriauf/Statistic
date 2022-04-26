package ru.netology.stats;

public class StatsService {
    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAvg(long[] sales) {
        return calculateSum(sales) / sales.length;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int overAvg(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > calcAvg(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int lessAvg(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < calcAvg(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
