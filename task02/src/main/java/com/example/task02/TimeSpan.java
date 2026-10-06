package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;
    public TimeSpan(int hours,int minutes,int seconds) {
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
        normalize();
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours=hours;
        normalize();
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes=minutes;
        normalize();
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds=seconds;
        normalize();
    }
    public void add(TimeSpan time) {
        this.hours+=time.hours;
        this.minutes+=time.minutes;
        this.seconds+=time.seconds;
        normalize();
    }
    public void subtract(TimeSpan time) {
        int totalSeconds=toSeconds();
        totalSeconds-=time.toSeconds();
        if (totalSeconds<0) {
            totalSeconds=0;
        }
        fromSeconds(totalSeconds);
    }
    private int toSeconds() {
        return hours*3600+minutes*60+seconds;
    }
    private void fromSeconds(int totalSeconds) {
        hours = totalSeconds/3600;
        totalSeconds%=3600;

        minutes=totalSeconds/60;
        seconds=totalSeconds%60;
    }

    private void normalize() {
        int totalSeconds=toSeconds();
        fromSeconds(totalSeconds);
    }

    @Override
    public String toString() {
        return hours+" ч. "+minutes+" мин. "+seconds+" сек.";
    }
}