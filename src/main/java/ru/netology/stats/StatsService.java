package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public int sumMiddleSalesInMonth(int[] sales) {
        int sumMiddleSales = sumAllSales(sales) / sales.length;
        return sumMiddleSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как минимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSalesInMonth(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int salesMinMiddleInMonth(int[] sales) {
        int monthMinMiddleSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[monthMinMiddleSales]) {
                monthMinMiddleSales = i;
            }
        }
        return monthMinMiddleSales + 1;

    }

    public int salesMaxMiddle(int[] sales) {
        int monthMaxMiddleSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[monthMaxMiddleSales]) {
                monthMaxMiddleSales = i;
            }
        }
        return monthMaxMiddleSales + 1;

    }
}
