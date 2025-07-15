import domain.FamilyTicket;
import domain.StudentTicket;
import domain.Ticket;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        FamilyTicket familyTicket = new FamilyTicket(BigDecimal.valueOf(50), 4);
        StudentTicket studentTicket = new StudentTicket(BigDecimal.valueOf(50));

        System.out.printf("The family ticket final price is: %s\n", familyTicket.getFinalPrice());
        System.out.printf("The student ticket final price is: %s\n", studentTicket.getFinalPrice());
    }
}
