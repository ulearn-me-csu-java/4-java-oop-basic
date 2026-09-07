package com.example.task02;

public class TimeSpan {

    private int sec;
    private int min;
    private int h;

    public TimeSpan(int h, int min, int sec) {
        int s = h * 3600 + min * 60 + sec;

        this.sec = s % 60;
        this.min = (s % 3600) / 60;
        this.h = s / 3600;
    }

    public int getSeconds() {
        return sec;
    }

    public void setSeconds(int sec) {
        this.sec = sec;
    }

    public int getMinutes() {
        return min;
    }

    public void setMinutes(int min) {
        this.min = min;
    }

    public int getHours() {
        return h;
    }

    public void setHours(int h) {
        this.h = h;
    }

    public void add(TimeSpan time) {
        int sec = (this.h + time.h) * 3600 + (this.min + time.min) * 60 + (this.sec + time.sec);

        this.h = sec / 3600;
        this.min = (sec % 3600) / 60;
        this.sec = sec % 60;
    }

    public void subtract(TimeSpan time) {
        int s1 = this.h * 3600 + this.min * 60 + this.sec;
        int s2 = time.h * 3600 + time.min * 60 + time.sec;
        int diff = s1 - s2;

        this.h = diff / 3600;
        this.min = (diff % 3600) / 60;
        this.sec = diff % 60;
    }

    public String toString() {
        return h + ":" + min + ":" + sec;
    }
}
