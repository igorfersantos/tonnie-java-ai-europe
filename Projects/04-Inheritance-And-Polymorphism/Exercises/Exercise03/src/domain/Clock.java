package domain;

public abstract class Clock {
    private int hour;
    private int minute;
    private int seconds;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    // Not asked to implement. Did it anyway.
    public void setTime(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public String getTime(){
        return String.format("%02d:%02d:%02d", hour, minute, seconds);
    }

    public abstract Clock convert(Clock clock);
}
