package ru.netology.statistic;

public class StatisticsService {
    int[] deals = new int[12]; // = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectedSumm;
    long average;
    int belowAverage = 0;
    int aboveAverage = 0;

    /**
     * данные по месяцам
     int month1 = 8;
     int month2 = 15;
     int month3 = 13;
     int month4 = 15;
     int month5 = 17;
     int month6 = 20;
     int month7 = 19;
     int month8 = 20;
     int month9 = 7;
     int month10 = 14;
     int month11 = 14;
     int month12 = 18;
     */

    /**
     * перенос данных в массив для удобной обработки и расчётов
     public int[] dataTranferToArray(int month1, int month2, int month3, int month4, int month5, int month6, int month7, int month8, int month9, int month10, int month11, int month12, int[] deals) {
     deals[0] = month1;
     deals[1] = month2;
     deals[2] = month3;
     deals[3] = month4;
     deals[4] = month5;
     deals[5] = month6;
     deals[6] = month7;
     deals[7] = month8;
     deals[8] = month9;
     deals[9] = month10;
     deals[10] = month11;
     deals[11] = month12;
     return deals;
     }
     */


    /**
     * расчёт суммы продаж
     */
    public int sumCalculate(int[] deals, int expectedSumm) {
        int summ = 0;
        for (int deal : deals) {
            summ += deal;
        }

        return summ;
    }

    /**
     * расчёт среднего числа продаж в месяц
     */
    public long averageCalculate(int summ, int[] deals) { //, long expectedAverage
        long average = summ / deals.length;
        return average;
    }


    // забыл, как вернуть номер "такого-то" элемента массива, поэтому немного некрасиво

    /**
     * последний месяц с наивысшими продажами
     */
    public int maxDealsIndex(int[] deals) {
        int index = 1;
        int maxDealsIndex = 1;
        int maxDeal = 0;
        for (int deal : deals) {
            if (maxDeal <= deal) {
                maxDeal = deal;
                maxDealsIndex = index;
            }
            index += 1;
        }

        return maxDealsIndex;
    }

    /**
     * последний месяц с наихудшими продажами
     */
    public int minDealsIndex(int[] deals) {
        int index = 1;
        int minDealsIndex = 1;
        int minDeal = deals[1];
        for (int deal : deals) {
            if (minDeal >= deal) {
                minDeal = deal;
                minDealsIndex = index;
            }
            index += 1;
        }

        return minDealsIndex;
    }

    /**
     * количество месяцев с количеством продаж ниже среднего
     */
    public int belowAverage(int[] deals, long average) {
        int belowAverage = 0;
        for (int deal : deals) {
            if (deal < average) {
                belowAverage += 1;
            }
        }
        return belowAverage;
    }

    /**
     * количество месяцев с количеством продаж выше среднего
     */
    public int aboveAverage(int[] deals, long average) {
        int aboveAverage = 0;
        for (int deal : deals) {
            if (deal < average) {
                belowAverage += 1;
            }
        }
        return belowAverage;
    }
}