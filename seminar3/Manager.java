package seminar3;

public class Manager  extends Employee{
     public static void salaryIncrease(Employee[] employees, int percentIncrease) {
         for (Employee employee : employees) {
             if (!(employee instanceof Manager)) {
                 employee.setSalary((float) (employee.getSalary()*(1+percentIncrease*0.01)));
             }
         }
    }

    public Manager(String name, String patronymic, String surname, int age, long phone, float salary, String position) {
        super(name, patronymic, surname, age, phone, salary, position);
    }
}
