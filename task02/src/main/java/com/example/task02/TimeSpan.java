package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        normalize();
    }

    // Геттеры и сеттеры
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

    // Сложение интервалов
    public void add(TimeSpan time) {
        if (time == null) {
            return;
        }
        int totalSecondsThis = toTotalSeconds();
        int totalSecondsOther = time.toTotalSeconds();

        fromTotalSeconds(totalSecondsThis + totalSecondsOther);
    }

    // Вычитание интервалов
    public void subtract(TimeSpan time) {
        if (time == null) {
            return;
        }
        int totalSecondsThis = toTotalSeconds();
        int totalSecondsOther = time.toTotalSeconds();

        int diff = totalSecondsThis - totalSecondsOther;
        fromTotalSeconds(Math.max(0, diff)); // Защита от отрицательного времени
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

    // Вспомогательный метод: переводит всё время объекта в секунды
    private int toTotalSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    // Вспомогательный метод: раскладывает секунды обратно по полям
    private void fromTotalSeconds(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }

    // Приводит минуты и секунды к нормальному виду (от 0 до 59)
    private void normalize() {
        fromTotalSeconds(toTotalSeconds());
    }
}