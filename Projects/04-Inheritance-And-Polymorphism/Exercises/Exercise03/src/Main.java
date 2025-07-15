import domain.BrazillianClock;
import domain.Clock;
import domain.USClock;

public class Main {
    public static void main(String[] args) {
        System.out.println("Time: 12:30:50");
        Clock usClock = new USClock();
        usClock.setHour(12);
        usClock.setMinute(30);
        usClock.setSeconds(50);
        ((USClock) usClock).setPeriod("PM");
        System.out.println("US Clock time: " + usClock.getTime());
        Clock brazillianClock = new BrazillianClock().convert(usClock);
        System.out.println("Brazilian Clock time: " + brazillianClock.getTime());
    }
}