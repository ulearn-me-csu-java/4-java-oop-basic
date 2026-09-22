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
        long totalSeconds = hours * 3600L + minutes * 60L + seconds
                + time.hours * 3600L + time.minutes * 60L + time.seconds;

        hours = (int) (totalSeconds / 3600);
        minutes = (int) (totalSeconds % 3600 / 60);
        seconds = (int) (totalSeconds % 60);
    }

    public void subtract(TimeSpan time) {
        long totalSeconds = hours * 3600L + minutes * 60L + seconds
                - time.hours * 3600L - time.minutes * 60L - time.seconds;

        hours = (int) (totalSeconds / 3600);
        minutes = (int) (totalSeconds % 3600 / 60);
        seconds = (int) (totalSeconds % 60);
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
