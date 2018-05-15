import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        Pattern p = Pattern.compile("^((0)?[1-9]|[12]\\d|3[01])((\\.)|(-)| )((0)?[1-9]|1[0-2])((\\.)|(-)| )(([12][019])?\\d{2})$");
        return p.matcher(dateString);
    }
}