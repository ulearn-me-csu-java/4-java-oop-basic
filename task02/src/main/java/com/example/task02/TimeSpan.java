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
        // Переводим секунды в минуты
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        } else if (seconds < 0) {
            int borrowMinutes = (Math.abs(seconds) + 59) / 60;
            minutes -= borrowMinutes;
            seconds += borrowMinutes * 60;
        }

        // Переводим минуты в часы
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        } else if (minutes < 0) {
            int borrowHours = (Math.abs(minutes) + 59) / 60;
            hours -= borrowHours;
            minutes += borrowHours * 60;
        }
    }

    @Override
    public String toString() {
        return hours + " ч " + minutes + " мин " + seconds + " сек";
    }
}