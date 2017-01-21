import java.util.Scanner;

/**
 * Created by Yevhen-PC on 21.01.2017.
 */
public class Input {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Введите что-нибудь");

        String string = s.nextLine();

        System.out.println("Вы ввели " +string);

    }
}
