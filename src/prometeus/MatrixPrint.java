package prometeus;

/**
 * Created by Yevhen-PC on 23.02.2017.
 */
public class MatrixPrint {

    public static void main(String[] args) {

        int[][] matrice = {{2,  3,  4},
                {11, 12, 14, 15},
                {16, 18, 20},
                {22, 23, 24}};

        for ( int i = 0; i<matrice.length; i++) {
            for (int j = 0; j<matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }


    }
}


