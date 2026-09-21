package com.example.task02;

public class TimeSpan {
    private double second;
    public void SetSecond(double s)
    {
        if(s >= 0)
        {second = s;}
        else {throw new AssertionError("Нельзя так");}
    }
    public double GetSecond(){return  second;}
    private double minute;
    public void SetMinute(double m)
    {
        if(m >= 0)
        {minute = m;}
        else {throw new AssertionError("Нельзя так");}
    }
    public double GetMinute(){return  minute;}
    private double hour;
    public void SetHour(double h)
    {
        if(h >= 0)
        {hour = h;}
        else {throw new AssertionError("Нельзя так");}
    }
    public double GetHour(){return  hour;}

    public TimeSpan(double h, double m, double s)
    {
        hour = h;
        minute = m;
        second = s;
    }

    private void normalize() {
        int totalSeconds = (int) Math.round(hour * 3600 + minute * 60 + second);
        if (totalSeconds < 0) {
            totalSeconds = 0;
        }
        this.hour = totalSeconds / 3600;
        this.minute = (totalSeconds % 3600) / 60;
        this.second = totalSeconds % 60;
    }

    public void add(TimeSpan time) {
        this.hour += time.hour;
        this.minute += time.minute;
        this.second += time.second;
        normalize();
    }

    public void subtract(TimeSpan time) {
        this.hour -= time.hour;
        this.minute -= time.minute;
        this.second -= time.second;
        normalize();
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", (int) hour, (int) minute, (int) second);
    }
}
