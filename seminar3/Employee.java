package seminar3;

public class Employee implements Comparable<Employee> {
    private String name;
    private String patronymic;
    private String surname;
    private int age;
    private long phone;
    private float salary;
    private String position;

    public Employee(String name, String patronymic, String surname, int age, long phone, float salary, String position) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        salary = salary*100;
        salary = Math.round(salary);
        salary = salary / 100;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        final int MAX_LENGTH_FIO = 36;
        String whitespace = " ";
        String corrector = surname + " " + name + " " + patronymic;
        if (corrector.length() < MAX_LENGTH_FIO) corrector = whitespace.repeat (MAX_LENGTH_FIO - corrector.length());
        return "[ФИО= " + surname + " " + name + " " + patronymic + corrector
                + "  ВОЗРАСТ=" + age
                + "  ОКЛАД=" + salary
                + "  ТЕЛЕФОН=" + phone
                + "  ДОЛЖНОСТЬ=" + position + "]";
    }

    public static void printTeamInfo(Employee[] team){
        for (Employee employee : team) {
            System.out.println(employee);
        }
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }
}
