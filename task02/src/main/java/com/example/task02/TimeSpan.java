package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        if (hours >= 0 && minutes >= 0 && seconds >= 0) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            toCorrectFormat();
        }
        else throw new IllegalArgumentException("Все передаваемые в конструктор TimeSpan числа должны быть положительными");
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0) {
            this.hours = hours;
            toCorrectFormat();
        }
        else throw new IllegalArgumentException("Значение часов не может быть отрицательным");
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0) {
            this.minutes = minutes;
            toCorrectFormat();
        }
        else throw new IllegalArgumentException("Значение минут не может быть отрицательным");
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0) {
            this.seconds = seconds;
            toCorrectFormat();
        }
        else throw new IllegalArgumentException("Значение секунд не может быть отрицательным");
    }

    private void toCorrectFormat() {
        // Переводим все в секунды
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        // Если отрицательное - устанавливаем 0
        if (totalSeconds < 0) {
            hours = 0;
            minutes = 0;
            seconds = 0;
            return;
        }


        // Раскладываем обратно
        this.hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        this.minutes = totalSeconds / 60;
        this.seconds = totalSeconds % 60;
    }

    // Сложение интервалов
    public void add(TimeSpan time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
        toCorrectFormat();
    }

    // Вычитание интервалов
    public void subtract(TimeSpan time) {
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
        toCorrectFormat();
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

