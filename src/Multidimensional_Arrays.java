/**
 * Created by Yevhen-PC on 30.01.2017.
 */
public class Multidimensional_Arrays {

    public static void main(String[] args) {

       // int[] number = {1, 2, 3};

       // System.out.println(number[1]);

        /**
         * 1, 2, 3, 4, 5, 6, 0, -1, -5
         *
         * 156
         * 378
         * 294

         int[][] matrice = {{1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}};

         System.out.println(matrice[1][1]);
         System.out.println(matrice[2][2]);

         String[][] strings = new String[3][4];
         strings[0][2] = "Привет";

         System.out.println(strings[0][2]);   */

        int[][] matrice = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};

        for ( int i = 0; i<matrice.length; i++) {
            for (int j = 0; j<matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }


    }
}
