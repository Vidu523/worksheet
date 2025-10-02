package LW_02;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Q_07 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "EEEE, MMMM d, uuuu", Locale.ENGLISH);


        String formatted = today.format(formatter);
        System.out.println(formatted);
    }
}


