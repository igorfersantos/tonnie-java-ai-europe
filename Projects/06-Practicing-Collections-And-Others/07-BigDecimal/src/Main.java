import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal value1 = new BigDecimal(56.36);
        BigDecimal value2 = new BigDecimal(99.34);
        System.out.println(value2.divide(value1, RoundingMode.HALF_DOWN));
    }
}