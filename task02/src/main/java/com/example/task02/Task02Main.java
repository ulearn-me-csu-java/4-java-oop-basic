package com.example.task02;
public class Task02Main {
    public static class TimeSpan {
        private int hours;
        private int minutes;
        private int seconds;

        public TimeSpan(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            normalize();
        }

        private void normalize() {
            int totalSeconds = hours * 3600 + minutes * 60 + seconds;
            this.hours = totalSeconds / 3600;
            int remainder = totalSeconds % 3600;
            this.minutes = remainder / 60;
            this.seconds = remainder % 60;
        }

        public void add(TimeSpan time) {
            this.hours += time.hours;
            this.minutes += time.minutes;
            this.seconds += time.seconds;
            normalize();
        }

        @Override
        public String toString() {
            return hours + " ч " + minutes + " мин " + seconds + " сек";
        }

        public static void main(String[] args) {
            TimeSpan t1 = new TimeSpan(1, 30, 45);
            TimeSpan t2 = new TimeSpan(0, 45, 30);
            t1.add(t2);
            System.out.println("Результат сложения: " + t1);
        }
    }
}
