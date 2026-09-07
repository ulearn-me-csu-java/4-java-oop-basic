package com.example.task02;

public class TimeSpan {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public int getHours() {
        return hours;
    }
    public void setHours(int _hours){
        hours = _hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int _minutes){
        minutes = _minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int _seconds){
        seconds = _seconds;
    }

    public TimeSpan(int _hours, int _minutes, int _seconds){
        hours = _hours;
        minutes = _minutes;
        seconds = _seconds;
    }

    public void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;

        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
    }

    public void subtract(TimeSpan time) {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;

        if (seconds < 0) {
            minutes--;
            seconds += 60;
        }
        if (minutes < 0) {
            hours--;
            minutes += 60;
        }
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}

