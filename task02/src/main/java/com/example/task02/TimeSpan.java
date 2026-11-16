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
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
        normalize();
    }

    public void subtract(TimeSpan time) {
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
        normalize();
    }

    private void normalize() {
        int totalSeconds = this.hours * 3600 + this.minutes * 60 + this.seconds;

        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }

    @Override
    public String toString() {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        int sign = totalSeconds < 0 ? -1 : 1;
        int abs = Math.abs(totalSeconds);
        return String.format("%s%d:%02d:%02d", sign < 0 ? "-" : "", abs / 3600, (abs % 3600) / 60, abs % 60);
    }
}
