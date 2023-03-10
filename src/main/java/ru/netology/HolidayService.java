package ru.netology;

public class HolidayService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money <= threshold) {
                money = money + income - expenses;
            } else {
                count++;
                money -= expenses;
                money /= 3;
            }
        }
        return count;
    }
}
