package prometeus;

/**
 * Created by Yevhen-PC on 25.02.2017.
 */
public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        System.out.println(search(data, 0, data.length, 10));

    }

    public static int search(int[] data, int low, int high, int k) {
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        } else if (data[mid] == k) {
            return mid;
        } else if (data[mid] < k) {
            return search(data, mid + 1, high, k);
        } else {
            return search(data, low, mid - 1, k);
        }
    }

}


