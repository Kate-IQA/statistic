package ru.netology.stats;

public class StatsService {
    public int monthWithMaxSum(int[] values) {
        int month = 0;
        int maxMonth = 0;
        long maxSumMonth = values[0];
        for (int value: values) {
            month += 1;
            if (maxSumMonth < value) {
                maxSumMonth = value;
                maxMonth = month;
            }
        }
        return maxMonth;
}
    
}

