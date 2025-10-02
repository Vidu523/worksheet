package LW_02;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Q_06 {
    public static void main(String[] args) {

            LocalDate today = LocalDate.now();

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("d MMMM uuuu", Locale.ENGLISH);


            String formatted = today.format(formatter);
            System.out.println(formatted);
        }
    }

