package com.example.task02;

public class TimeSpan {
    private int hour;
    private int min;
    private int sec;

    public TimeSpan(int hour, int min, int sec) {
        int s = hour * 3600 + min * 60 + sec;

        this.sec = s % 60;
        this.min = (s % 3600) / 60;
        this.hour = s / 3600;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void add(TimeSpan time) {
        int sec = (this.hour + time.hour) * 3600 + (this.min + time.min) * 60 + (this.sec + time.sec);

        this.hour = sec / 3600;
        this.min = (sec % 3600) / 60;
        this.sec = sec % 60;
    }

    public void subtract(TimeSpan time) {
        int s1 = this.hour * 3600 + this.min * 60 + this.sec;
        int s2 = time.hour * 3600 + time.min * 60 + time.sec;
        int diff = s1 - s2;

        this.hour = diff / 3600;
        this.min = (diff % 3600) / 60;
        this.sec = diff % 60;
    }


    public String toString() {
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}
