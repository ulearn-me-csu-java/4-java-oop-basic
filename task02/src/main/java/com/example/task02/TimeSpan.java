package com.example.task02;

public class TimeSpan{
    private int hour;
    private int minute;
    private int second;

    
    public TimeSpan(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        fromSecond(inSecond());
    }

    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        this.hour = hour;
    }

    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        this.second = second;
    }

    private void fromSecond(int all){
        hour = all / 3600;
        minute = (all % 3600) / 60;
        second = (all % 3600) % 60;
    }

    private int inSecond(){
        return hour * 3600 + minute * 60 + second;
    }

    public void add(TimeSpan time) {
        fromSecond(inSecond() + time.inSecond());
    }
    
    public void subtract(TimeSpan time) {
        fromSecond(inSecond() - time.inSecond());
    }

    public String toString(){
        return hour + ":" + minute + ":" + second;
    }

}