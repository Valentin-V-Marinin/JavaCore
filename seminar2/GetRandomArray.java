package seminar2;

import java.util.Random;

public class GetRandomArray {
    public int[] createRandomArray(int sizeArr){

        int[] result = new int[((sizeArr > 0) ? sizeArr : 0)];
        int counter = 0;
        Random rd = new Random();
        while (counter < sizeArr) {
            result[counter] = rd.nextInt(-500, 500);
            counter++;
        }

        return result;
    }

}
