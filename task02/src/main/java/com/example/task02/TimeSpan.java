package com.example.task02;

import java.sql.Time;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void add(TimeSpan time){
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;

        if (seconds >= 60){
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60){
            hours += minutes / 60;
            minutes = minutes % 60;
        }
    }
    void subtract(TimeSpan time){
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;

        if (seconds < 0){
            minutes--;
            seconds += 60;
        }
        if (minutes < 0){
            hours--;
            minutes += 60;
        }
    }
    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}
