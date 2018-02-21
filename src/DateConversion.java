import java.util.Date;
import java.text.SimpleDateFormat;

public class DateConversion {
    public static void main(String[] args) {
        SimpleDateFormat sdf=   new SimpleDateFormat("dd/MM/yyyy");
String date=sdf.format(new Date());
        System.out.println(date);
    }

}
