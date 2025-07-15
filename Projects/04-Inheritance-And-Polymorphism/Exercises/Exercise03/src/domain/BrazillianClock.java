package domain;

public class BrazillianClock extends Clock {
    @Override
    public Clock convert(Clock clock) {
        switch (clock) {
            case USClock usClock -> {
                int hour = usClock.getHour();
                if (usClock.getPeriod() == "PM") {
                    hour += 12;
                }
                setTime(hour, usClock.getMinute(), usClock.getMinute());
            }
            case BrazillianClock brazillianClock -> {
                setTime(brazillianClock.getHour(), brazillianClock.getMinute(), brazillianClock.getSeconds());
            }
            case Clock clock1 -> {
                setTime(clock1.getHour(), clock1.getMinute(), clock1.getSeconds());
            }
        }
        return this;
    }
}
