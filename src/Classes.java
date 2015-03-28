/**
 * Created by Jalpesh Vadgama on 29-03-2015.
 */
public class Classes {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jalpesh Vadgama";
        person.age = 35;

        System.out.println(person.name);
        System.out.println(person.age);
    }
}

class Person {
    String name;
    int age;
}