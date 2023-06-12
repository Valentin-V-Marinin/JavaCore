package seminar1.timeCounting;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class TimeCounter {
    private final int years;
    private final int months;
    private int weeks;
    private final int days;

    private final LocalDate today;
    private final LocalDate date;

    public TimeCounter(LocalDate date) {
        this.date = date;
        today = LocalDate.now();
        Period period = Period.between(date, today);
        years = period.getYears();
        months = years*12 + period.getMonths();
        days = (int) Duration.between(date.atStartOfDay(), today.atStartOfDay()).toDays();
        if (days != 0) {
            weeks = Math.abs(days / 7);
        }
    }

    public LocalDate getToday() {
        return today;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getYears() {
        return years;
    }


    public int getMonths() {
        return months;
    }


    public int getWeeks() {
        return weeks;
    }


    public int getDays() {
        return days;
    }


}
