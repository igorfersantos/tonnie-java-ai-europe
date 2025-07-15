public class Car {
    // I know I could use an associative array
    // but considering that I didn't saw it yet in the course
    // it could be considered cheating
    private static final int GEAR1_MAX_SPEED = 20;
    private static final int GEAR2_MAX_SPEED = 40;
    private static final int GEAR3_MAX_SPEED = 60;
    private static final int GEAR4_MAX_SPEED = 80;
    private static final int GEAR5_MAX_SPEED = 100;
    private static final int GEAR6_MAX_SPEED = 120;

    private boolean turnedOn = false;
    private int speed = 0;
    private int gear = 0;
    private int currentMaxSpeed = 0;

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public boolean turnOn() {
        if (turnedOn) return false;
        turnedOn = true;
        return true;
    }

    public boolean turnOff() {
        if (speed > 0 || gear > 0) return false;
        if (!turnedOn) return false;
        turnedOn = false;
        return true;
    }

    public boolean accelerate() {
        if (!turnedOn) return false;
        switch (gear) {
            case 0:
                return false;
            case 1:
                if (speed < GEAR1_MAX_SPEED) speed++;
                break;
            case 2:
                if (speed < GEAR2_MAX_SPEED) speed++;
                break;
            case 3:
                if (speed < GEAR3_MAX_SPEED) speed++;
                break;
            case 4:
                if (speed < GEAR4_MAX_SPEED) speed++;
                break;
            case 5:
                if (speed < GEAR5_MAX_SPEED) speed++;
                break;
            case 6:
                if (speed < GEAR6_MAX_SPEED) speed++;
                break;
        }
        if (speed == 120) return false;
        return true;
    }

    public boolean decelerate() {
        if (!turnedOn) return false;
        switch (gear) {
            case 0:
                return false;
            case 1:
                if (speed > GEAR1_MAX_SPEED - 19) speed--;
                break;
            case 2:
                if (speed > GEAR2_MAX_SPEED - 19) speed--;
                break;
            case 3:
                if (speed > GEAR3_MAX_SPEED - 19) speed--;
                break;
            case 4:
                if (speed > GEAR4_MAX_SPEED - 19) speed--;
                break;
            case 5:
                if (speed > GEAR5_MAX_SPEED - 19) speed--;
                break;
            case 6:
                if (speed > GEAR6_MAX_SPEED - 19) speed--;
                break;
        }
        if (speed == 1) return false;
        return true;
    }

    public boolean turn() {
        if (!turnedOn) return false;
        if (speed < 1 || speed > 40) return false;
        return true;
    }

    public boolean changeGear(int direction) {
        if (!turnedOn) return false;
        if (direction == 1 && gear == 6) return false;
        if (direction == 0 && gear == 0) return false;
        if (direction == 0) {
            gear--;
        } else {
            gear++;
        }
        return true;
    }
}
