/**
 * Created by Yevhen-PC on 31.01.2017.
 */
public class ClassesAndObjects {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        System.out.println("Меня зовут " + person1.name + ", " + "мне " + person1.age + " лет");

        Person person2 = new Person();
        person2.name = "Семен";
        person2.age = 18;
        System.out.println("Меня зовут " + person2.name + ", " + "мне " + person2.age + " лет");
    }
}

class Person {
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)

    String name;
    int age;

}
