package seminar2;

//Seminar2 Task2
//Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.

public class Task2 {

    private int smaller, biggest;
    private final int[] arrayRandom;

    private final boolean emptyArray;


    public Task2(int sizeArr) {
        if (sizeArr > 0) {emptyArray = false;} else {emptyArray = true;}
        if (!emptyArray) {
            arrayRandom = new GetRandomArray().createRandomArray(sizeArr);
            findSmallerBiggestNumber();
        } else {
            arrayRandom = null;
        }
    }

    public int[] getArrayRandom() {
        return arrayRandom;
    }

    private void findSmallerBiggestNumber(){
        for (int i = 0; i < arrayRandom.length; i++) {
            if (i == 0) {
                smaller = arrayRandom[i];
                biggest = arrayRandom[i];
            }
            if (i > 0 && arrayRandom[i] < smaller) smaller = arrayRandom[i];
            if (i > 0 && arrayRandom[i] > biggest) biggest = arrayRandom[i];
        }
    }

    public void printTask2(int[] arr){
        if (emptyArray) {
            System.out.println("Empty array!");
        } else {
            new PrintArray().printArr(arr);
            System.out.println("Array MAX = " + biggest);
            System.out.println("Array MIN = " + smaller);
            System.out.println("The difference is: " + (biggest - smaller));
        }
    }
}
