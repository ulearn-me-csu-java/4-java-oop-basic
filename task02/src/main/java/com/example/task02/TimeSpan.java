package com.example.task02;

public class TimeSpan {

    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void add(TimeSpan time) {
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;

        minutes += seconds / 60;
        seconds %= 60;

        hours += minutes / 60;
        minutes %= 60;
    }

    public void subtract(TimeSpan time) {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        totalSeconds -= time.hours * 3600 + time.minutes * 60 + time.seconds;

        hours = totalSeconds / 3600;
        totalSeconds %= 3600;

        minutes = totalSeconds / 60;
        seconds = totalSeconds % 60;
    }

    @Override
    public String toString() {
        return hours + " ч. " + minutes + " мин. " + seconds + " сек.";
    }
}