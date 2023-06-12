package seminar2;

// Seminar2 Task1
//**Написать метод, возвращающий количество чётных элементов массива


public class Task1 {
    private final int[] arrayRandom;

    public Task1(int sizeArr) {
        this.arrayRandom = new GetRandomArray().createRandomArray(sizeArr);
    }

    public int[] getArrayRandom() {
        return arrayRandom;
    }

    private int countEvenNumbers(){
        int result = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i]%2 == 0) result++;
        }
        return result;
    }

    public void printArr(int[] arr){
        PrintArray pa = new PrintArray();
        pa.printArr(arr);
        System.out.println("This array includes " + countEvenNumbers() + " even number(s).");
    }

}
