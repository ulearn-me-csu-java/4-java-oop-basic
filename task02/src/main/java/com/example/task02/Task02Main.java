package com.example.task02;

class TimeSpan{
    private int sec;
    private int min;
    private int hour;

    public TimeSpan(int hour, int min, int sec){
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }
    public int getSec(){
        return sec;
    }
    public int getMin(){
        return min;
    }
    public int getHour(){
        return hour;
    }

    public void setSec(int sec){
        this.sec = sec;
    }
    public void setMin(int min){
        this.min = min;
    }
    public void setHour(int hour){
        this.hour = hour;
    }

    public void add(TimeSpan time){
        this.sec += time.sec;
        while (this.sec >= 60) {
            this.min += 1;
            this.sec -= 60;
        }
        this.min += time.min;
        while (this.min >= 60) {
            this.hour += 1;
            this.min -= 60;
        }
        this.hour += time.hour;
    }

    public void subtract(TimeSpan time){
        this.sec -= time.sec;
        while (this.sec < 0) {
            this.min -= 1;
            this.sec += 60;
        }
        this.min -= time.min;
        while (this.min < 0) {
            this.hour -= 1;
            this.min += 60;
        }
        this.hour -= time.hour;
    }

    public String toString(){
        return this.hour + ":" + this.min + ":" + this.sec;
    }


}

public class Task02Main {

    public static void main(String[] args) {

    }
}
