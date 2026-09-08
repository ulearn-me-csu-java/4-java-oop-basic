package com.example.task02;

/**
 * Класс для хранения временного интервала в часах, минутах и секундах
 */
public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    // Конструктор
    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
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


    private void normalize() {
        // Нормализуем секунды
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        } else if (seconds < 0) {
            int borrow = (-seconds + 59) / 60;
            minutes -= borrow;
            seconds += borrow * 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        } else if (minutes < 0) {
            int borrow = (-minutes + 59) / 60;
            hours -= borrow;
            minutes += borrow * 60;
        }

    }


    public void add(TimeSpan time) {
        if (time == null) {
            return;
        }
        this.seconds += time.seconds;
        this.minutes += time.minutes;
        this.hours += time.hours;
        normalize();
    }


    public void subtract(TimeSpan time) {
        if (time == null) {
            return;
        }
        this.seconds -= time.seconds;
        this.minutes -= time.minutes;
        this.hours -= time.hours;
        normalize();
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}