package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        int sec = hours * 3600 + minutes * 60 + seconds;
        this.hours = sec / 3600;
        this.minutes = (sec % 3600) / 60;
        this.seconds = sec % 60;
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
        int sec = (this.hours + time.hours) * 3600 + (this.minutes + time.minutes) * 60 + (this.seconds + time.seconds);
        this.hours = sec / 3600;
        this.minutes = (sec % 3600) / 60;
        this.seconds = sec % 60;
    }

    public void subtract(TimeSpan time) {
        int s1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int s2 = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int diff = s1 - s2;
        this.hours = diff / 3600;
        this.minutes = (diff % 3600) / 60;
        this.seconds = diff % 60;
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
