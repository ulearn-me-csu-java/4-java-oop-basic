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

    private void normalize() {
        if (this.seconds < 0) {
            int borrowedMinutes = (this.seconds - 59) / 60;
            this.minutes += borrowedMinutes;
            this.seconds -= borrowedMinutes * 60;
        } else if (this.seconds >= 60) {
            this.minutes += this.seconds / 60;
            this.seconds = this.seconds % 60;
        }

        if (this.minutes < 0) {
            int borrowedHours = (this.minutes - 59) / 60;
            this.hours += borrowedHours;
            this.minutes -= borrowedHours * 60;
        } else if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes = this.minutes % 60;
        }
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
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
    void add(TimeSpan time){
        this.hours += time.getHours();
        this.minutes += time.getMinutes();
        this.seconds += time.getSeconds();
        normalize();

    }
    void subtract(TimeSpan time){
        this.hours -= time.getHours();
        this.minutes -= time.getMinutes();
        this.seconds -= time.getSeconds();
        normalize();

    }

    @Override
    public String toString() {
        return this.hours + "h " + this.minutes + "m " + this.seconds + "s";
    }
}
