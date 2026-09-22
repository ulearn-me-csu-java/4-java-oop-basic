package com.example.task02;

public class TimeSpan
{
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    public int getHours()
    {
        return hours;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
        normalize();
    }

    public int getMinutes()
    {
        return minutes;
    }

    public void setMinutes(int minutes)
    {
        this.minutes = minutes;
        normalize();
    }

    public int getSeconds()
    {
        return seconds;
    }

    public void setSeconds(int seconds)
    {
        this.seconds = seconds;
        normalize();
    }

    public void add(TimeSpan time)
    {
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
    public String toString()
    {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    private void normalize()
    {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        boolean negative = totalSeconds < 0;
        if (negative)
        {
            totalSeconds = -totalSeconds;
        }

        hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600) / 60;
        seconds = totalSeconds % 60;

        if (negative)
        {
            hours = -hours;
            minutes = -minutes;
            seconds = -seconds;
        }
    }
}
