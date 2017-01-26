/**
 * Created by Yevhen-PC on 26.01.2017.
 */
public class Arrays {

    public static void main(String[] args) {
        int number = 10;                    // примитивный тип данных [10]
        int[] numbers = new int[5];         // numbers => [массив] - ссылочный тип данных

        /**System.out.println(numbers[0]);     // 0 1 2 3 4
        System.out.println(numbers[5]);

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50; */

        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = i*10;
        }

        for(int i = 0; i<numbers.length; i++ ) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        int[] numbers1 = {1, 2, 3};
        for(int i = 0; i<numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}
