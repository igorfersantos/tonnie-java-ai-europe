package basicoperations.domain;

import java.util.HashSet;
import java.util.Set;

public class GuestsConjucture {
    Set<Guest> guests;

    public GuestsConjucture() {
        guests = new HashSet<>();
    }

    @Override
    public String toString() {
        return "GuestsConjucture{" +
                "guests=" + guests +
                '}';
    }

    public void addGuest(final String name, final int inviteNumber) {
        guests.add(new Guest(name, inviteNumber));
    }

    public void removeGuestByInviteNumber(final int inviteNumber) {
        guests.remove(guests.stream().filter(guest -> guest.getInviteNumber() == inviteNumber).findFirst().orElseThrow());
    }

    public int countGuests() {
        return guests.size();
    }

    public void showGuests() {
        System.out.println("Guests: " + guests);
    }

    public static void main(String[] args) {
        GuestsConjucture guestsConjucture = new GuestsConjucture();
        guestsConjucture.addGuest("João", 1);
        guestsConjucture.addGuest("João", 1);
        guestsConjucture.addGuest("Maria", 2);
        guestsConjucture.addGuest("Alfredo", 3);
        System.out.println("Guests: " + guestsConjucture.countGuests());
        guestsConjucture.showGuests();
        System.out.println();

        guestsConjucture.removeGuestByInviteNumber(2);
        System.out.println("Guests: " + guestsConjucture.countGuests());
        guestsConjucture.showGuests();
        System.out.println();
    }
}
