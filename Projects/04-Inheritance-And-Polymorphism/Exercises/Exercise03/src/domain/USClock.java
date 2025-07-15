package domain;

public class USClock extends Clock {
    private String period = "AM";

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }


    @Override
    public String getTime() {
        return String.format("%02d:%02d:%02d %s", getHour(), getMinute(), getSeconds(), period);
    }

    @Override
    public Clock convert(Clock clock) {
        switch (clock) {
            case USClock usClock -> {
                setTime(usClock.getHour(), usClock.getMinute(), usClock.getMinute());
            }
            case BrazillianClock brazillianClock -> {
                int hour = brazillianClock.getHour();
                if (hour >= 12) {
                    hour -= 12;
                    period = "PM";
                }
                setTime(hour, brazillianClock.getMinute(), brazillianClock.getSeconds());
            }
            case Clock clock1 -> {
                int hour = clock1.getHour();
                if (hour >= 12) {
                    hour -= 12;
                    period = "PM";
                }
                setTime(hour, clock1.getMinute(), clock1.getSeconds());
            }
        }
        return this;
    }
}
