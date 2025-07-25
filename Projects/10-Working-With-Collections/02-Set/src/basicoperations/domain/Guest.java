package basicoperations.domain;

import java.util.Objects;

public class Guest {
    private String name;
    private int inviteNumber;

    public Guest() {
    }

    public Guest(String name, int inviteNumber) {
        this.name = name;
        this.inviteNumber = inviteNumber;
    }

    public String getName() {
        return name;
    }

    public int getInviteNumber() {
        return inviteNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Guest guest)) return false;
        return inviteNumber == guest.inviteNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inviteNumber);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", inviteNumber=" + inviteNumber +
                '}';
    }
}
