package seminar1.timeCounting;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class DataReciever {
    private String sdate;
    private Date date;

    public LocalDate getDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your birthday, use this format: dd/mm/yyyy");
        sdate = scanner.nextLine();

        if (!checkDate()) {
            throw new RuntimeException("Incorrect date!");
        }
        scanner.close();
        return LocalDate.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    private boolean checkDate(){
        boolean result = true;

            try {
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                date = df.parse(sdate);
            }
            catch (ParseException e){
                result = false;
                System.out.println(e.getMessage());
            }
        return result;
    }
}
