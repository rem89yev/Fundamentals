/**
 * Created by Yevhen-PC on 31.01.2017.
 */
public class ClassesAndObjects {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Семен";
        person2.age = 18;
        person2.sayHello();
    }
}

class Person {
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)

    String name;
    int age;
    void speak() {
        for(int i = 0; i<3; i++) {


            System.out.println("Меня зовут " + name + ", мне " + age + " лет");}

        }

        void sayHello() {

            System.out.println("Привет");

    }

}

