package com.example.task02;

import java.sql.Time;

public class TimeSpan {
    private int hour;
    private int minutes;
    private int second;

    public TimeSpan(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void add(TimeSpan time) {
        int totalSeconds = this.second + time.second;
        int totalMinutes = this.minutes + time.minutes + totalSeconds / 60;
        int totalHours = this.hour + time.hour + totalMinutes / 60;

        this.second = totalSeconds % 60;
        this.minutes = totalMinutes % 60;
        this.hour = totalHours;
    }

    public void subtract(TimeSpan time) {
        int secDiff = this.second - time.second;
        int borrowMin = 0;
        if (secDiff < 0) {
            secDiff += 60;
            borrowMin += 1;
        }
        int minDiff = this.minutes - time.minutes - borrowMin;
        int borrowHour = 0;
        if (minDiff < 0) {
            minDiff += 60;
            borrowHour += 1;
        }
        int hourDiff = this.hour - time.hour - borrowHour;

        second = secDiff;
        minutes = minDiff;
        hour = hourDiff;
    }

    public String toString() {
        return hour + "ч. " + minutes + "мин. " + second + "сек. ";
    }
}