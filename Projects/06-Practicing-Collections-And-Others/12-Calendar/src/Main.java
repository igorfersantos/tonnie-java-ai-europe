import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        var calendar = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss Z");
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.ERA));
        System.out.println(calendar.get(Calendar.AM));
        System.out.println(df.format(calendar.getTime()));
    }
}