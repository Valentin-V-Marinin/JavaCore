package seminar2;

public class PrintArray {

    public void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("The array of "+ arr.length + " elements:   [" + arr[i] + " ");
            } else if (i == arr.length-1) {
                System.out.print(arr[i] + "]\n");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
