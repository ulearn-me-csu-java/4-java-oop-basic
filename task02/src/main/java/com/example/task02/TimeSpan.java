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

    public void add(TimeSpan other) {
        this.hours += other.hours;
        this.minutes += other.minutes;
        this.seconds += other.seconds;
        normalize();
    }

    public void subtract(TimeSpan other) {
        long totalThis = this.hours * 3600L + this.minutes * 60L + this.seconds;
        long totalOther = other.hours * 3600L + other.minutes * 60L + other.seconds;
        long total = totalThis - totalOther;
        if (total < 0) {
            total = 0;
        }
        this.hours = (int) (total / 3600);
        this.minutes = (int) ((total % 3600) / 60);
        this.seconds = (int) (total % 60);
    }

    private void normalize() {
        long totalSeconds = this.hours * 3600L + this.minutes * 60L + this.seconds;
        if (totalSeconds < 0) {
            totalSeconds = 0;
        }
        this.hours = (int) (totalSeconds / 3600);
        this.minutes = (int) ((totalSeconds % 3600) / 60);
        this.seconds = (int) (totalSeconds % 60);
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}