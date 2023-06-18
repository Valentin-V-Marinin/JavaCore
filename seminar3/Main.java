package seminar3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] team = new Employee[5];
        team[0] = new Employee("Петр", "Иванович", "Сидоров", 25, 89152335694L, 23000.48f, "охранник");
        team[1] = new Employee("Игорь", "Николаевич", "Фёдоров", 28, 89152335688L, 20000.00f, "грузчик");
        team[2] = new Manager("Яков", "Соломонович", "Вексельберг", 47, 89152335652L, 60000.00f, "директор");
        team[3] = new Employee("Татьяна", "Ивановна", "Немоляева", 20, 89152335333L, 18000.19f, "кассир");
        team[4] = new Employee("Ирина", "Сергеевна", "Безрукова", 35, 89165000694L, 25000.00f, "продавец");

        Manager.printTeamInfo(team);
        System.out.println("-------------------------- salary increase result ---------------------------------------------------------------------------");
        Manager.salaryIncrease(team, 7);
        Manager.printTeamInfo(team);
        System.out.println("-------------------------- sorted by salary ---------------------------------------------------------------------------------");
        Arrays.sort(team);
        Manager.printTeamInfo(team);
        System.out.println("-------------------------- sorted by age ------------------------------------------------------------------------------------");
        Arrays.sort(team, new AgeComparator());
        Manager.printTeamInfo(team);
    }
}
