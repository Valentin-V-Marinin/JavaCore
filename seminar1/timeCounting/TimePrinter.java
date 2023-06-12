package seminar1.timeCounting;

public class TimePrinter {
    TimeCounter timeCounter;

    public TimePrinter(TimeCounter timeCounter) {
        this.timeCounter = timeCounter;
    }

    /**
     * Print duration between two dates in years, months, weeks and days.
     */
    public void print() {
        System.out.println("Date of your birthday: " + timeCounter.getDate());
        System.out.println("Today:                 " + timeCounter.getToday());
        System.out.println("Difference in years:   " + Math.abs(timeCounter.getYears()));
        System.out.println("Difference in months:  " + Math.abs(timeCounter.getMonths()));
        System.out.println("Difference in weeks:   " + Math.abs(timeCounter.getWeeks()));
        System.out.println("Difference in days:    " + Math.abs(timeCounter.getDays()));
    }
}
