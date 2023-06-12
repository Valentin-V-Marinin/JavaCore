package seminar2;

//Seminar2 Task3
//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

import java.util.ArrayList;

public class Task3 {
    private final int[] arr31 = {2,1,0,5,8,9,0};
    private final int[] arr32 = {2,1,0,0,8,9,0,6};
    private final int[] arr33 = {2,1,0,5,8,9,1};
    private final int[] arr34 = {2,1,8,9,0,6,0,0};
    private final int[] arr35 = {0,0,2,1,8,9,0,6,0,9};

    public int[] getArr31() {
        return arr31;
    }

    public int[] getArr32() {
        return arr32;
    }

    public int[] getArr33() {
        return arr33;
    }

    public int[] getArr34() {
        return arr34;
    }

    public int[] getArr35() {
        return arr35;
    }

    public boolean searchZeroPair(int[] arr){
        boolean result = false;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arrayList.add(i);
        }

        if (arrayList.size() > 1) {
            for (int i = 1; i < arrayList.size(); i++) {
                if (arrayList.get(i) - arrayList.get(i-1) == 1) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

}
