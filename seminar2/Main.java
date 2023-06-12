package seminar2;

public class Main {
    public static void main(String[] args) {
        Task1 sem2_1 = new Task1(7);
        sem2_1.printArr(sem2_1.getArrayRandom());

        System.out.println("----------------------------------------------------------------------------------");
        Task2 sem2_2 = new Task2(12);
        sem2_2.printTask2(sem2_2.getArrayRandom());


        System.out.println("----------------------------------------------------------------------------------");
        Task3 sem2_3 = new Task3();
        PrintArray pa = new PrintArray();
        pa.printArr(sem2_3.getArr31());
        System.out.println( sem2_3.searchZeroPair(sem2_3.getArr31()));
        pa.printArr(sem2_3.getArr32());
        System.out.println( sem2_3.searchZeroPair(sem2_3.getArr32()));
        pa.printArr(sem2_3.getArr33());
        System.out.println( sem2_3.searchZeroPair(sem2_3.getArr33()));
        pa.printArr(sem2_3.getArr34());
        System.out.println( sem2_3.searchZeroPair(sem2_3.getArr34()));
        pa.printArr(sem2_3.getArr35());
        System.out.println( sem2_3.searchZeroPair(sem2_3.getArr35()));

    }

}
