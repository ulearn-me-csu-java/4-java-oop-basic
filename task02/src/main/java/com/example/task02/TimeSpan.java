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
        fromTotalSeconds(this.toTotalSeconds() + time.toTotalSeconds());
    }

    public void subtract(TimeSpan time) {
        fromTotalSeconds(this.toTotalSeconds() - time.toTotalSeconds());
    }

    @Override
    public String toString() {
        int total = toTotalSeconds();
        String sign = total < 0 ? "-" : "";
        return String.format("%s%02d:%02d:%02d",
                sign, Math.abs(hours), Math.abs(minutes), Math.abs(seconds));
    }

    // Переводит интервал в секунды
    private int toTotalSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    // Раскладывает секунды обратно на часы, минуты и секунды
    private void fromTotalSeconds(int total) {
        hours = total / 3600;
        minutes = total % 3600 / 60;
        seconds = total % 60;
    }

    // Приводит поля к корректному виду (например, 60 минут -> 1 час)
    private void normalize() {
        fromTotalSeconds(toTotalSeconds());
    }
}
