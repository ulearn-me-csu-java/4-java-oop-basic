package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize(); // Сразу приводим к нормальному виду
    }

    // Метод для нормализации (например, 0ч 90м 0с -> 1ч 30м 0с)
    private void normalize() {
        // Переводим всё в секунды
        long totalSeconds = hours * 3600L + minutes * 60L + seconds;
        
        // Обратно раскладываем
        this.hours = (int) (totalSeconds / 3600);
        totalSeconds %= 3600;
        this.minutes = (int) (totalSeconds / 60);
        this.seconds = (int) (totalSeconds % 60);
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

    @Override
    public String toString() {
        return hours + "ч " + minutes + "м " + seconds + "с";
    }
}
