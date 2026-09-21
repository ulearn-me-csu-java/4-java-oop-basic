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
        int total = this.hours * 3600 + this.minutes * 60 + this.seconds;
        total += time.hours * 3600 + time.minutes * 60 + time.seconds;
        this.hours = total / 3600;
        this.minutes = (total % 3600) / 60;
        this.seconds = total % 60;
    }

    public void subtract(TimeSpan time) {
        int total = this.hours * 3600 + this.minutes * 60 + this.seconds;
        total -= time.hours * 3600 + time.minutes * 60 + time.seconds;
        this.hours = total / 3600;
        this.minutes = (total % 3600) / 60;
        this.seconds = total % 60;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}