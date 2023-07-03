package seminar5;

public class Main {
    public static void main(String[] args) {
        // Задание №1
        //   В функцию backup передаём путь до папки, для которой создаём резервную копию
        //   Task1.backupFiles("C:\\Users\\V\\Documents\\MyEverything\\ZIP7");

        // Задание №2
        //   0 - пусто, 1 - X, 2 - O, 3 - резерв
        //   лидирующие нули не проставляем, т.е. если верхняя и нижняя строки пустые, то имеем 102000
        //   цифры от 4 до 9 считаем за ноль
        // для сохрнения в 3 байтах рассматриваем каждый ряд как восьмибитное число
        // в этом числе первая пара бит резервная, а остальные 3 пары используются для кодировки трех значений ряда
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.savePosition(21820916);
        ticTacToe.loadPosition();

    }
}
