package prometeus;

import java.util.Arrays;

/**
 * Created by Yevhen-PC on 24.02.2017.
 */
public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        Arrays.sort(array);


        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

