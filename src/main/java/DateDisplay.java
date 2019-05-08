import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateDisplay
{
    public void date()
    {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(c.getTime()));
        System.out.println();

    }

    public static void main(String[] args) {
        DateDisplay dateDisplay=new DateDisplay();
        dateDisplay.date();
    }
}
