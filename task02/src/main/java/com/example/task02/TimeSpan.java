package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
        normalize();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        normalize();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        normalize();
    }

    public void add(TimeSpan time) {
        hours = hours + time.hours;
        minutes = minutes + time.minutes;
        seconds = seconds + time.seconds;
        normalize();
    }

    public void subtract(TimeSpan time) {
        hours = hours - time.hours;
        minutes = minutes - time.minutes;
        seconds = seconds - time.seconds;
        normalize();
    }

    private void normalize() {
        int total = hours * 3600 + minutes * 60 + seconds;
        hours = total / 3600;
        minutes = total % 3600 / 60;
        seconds = total % 60;
    }

    @Override
    public String toString() {
        return hours + " ч " + minutes + " мин " + seconds + " сек";
    }
}