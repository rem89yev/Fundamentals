import java.util.Scanner;

/**
 * Created by Yevhen-PC on 25.01.2017.
 */
public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");


        /**
        int age = scanner.nextInt();
        if(age==10) {
            System.out.println("Ты учишься в школе");
        } else if(age==18) {
            System.out.println("Ты закончил школу");
        }

        switch(age){
            case 0 :
                System.out.println("Ты родился");
                break;
            case 7 :
                System.out.println("Ты пошол в школу");
                break;
            case 18 :
                System.out.println("Ты закончил школу");
                break;
                default:
                    System.out.println("Ни одно из предыдущих условий не подошло"); */

        String age = scanner.nextLine();
        switch(age){
            case "ноль" :
                System.out.println("Ты родился");
                break;
            case "семь" :
                System.out.println("Ты пошол в школу");
                break;
            case "восемнадцать" :
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}
