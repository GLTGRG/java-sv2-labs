package statements;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInMinutes(){
        int hourInMin = 60;
        return hour*hourInMin+minute;
    }

    public int getInSeconds(){
        int minInSec = 60;
        return getInMinutes()*minInSec+second;
    }

    public boolean earlierThan(Time other) {
        int thisTimeInSeconds = this.getInSeconds();
        int otherTimeInSeconds = other.getInSeconds();
        return thisTimeInSeconds < otherTimeInSeconds;
    }

    public String toString(){
        return hour + ":" + minute + ":" + second;
    }
}
