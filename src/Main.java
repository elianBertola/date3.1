import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //creazione data
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //formattazione data
        OffsetDateTime newDate = date.plusYears(1).minusMonths(1).plusDays(7);
        String newDateString = newDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).localizedBy(Locale.ITALY));

        //stampa data
        System.out.println(newDateString);
    }
}