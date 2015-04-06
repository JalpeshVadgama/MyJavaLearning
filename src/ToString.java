/**
 * Created by Jalpesh Vadgama on 01-04-2015.
 * To string method in Java
 */
public class ToString {

    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.toString());

        AnotherClass anotherClass = new AnotherClass();

        //It prints hashcode for the object
        System.out.println(anotherClass.toString());
        System.out.println(anotherClass);

        ClassWithString classWithString = new ClassWithString(1, "Jalpesh Vadgama");
        System.out.println(classWithString.toString());

    }
}

class AnotherClass {

}

class ClassWithString {
    private int id;
    private String name;

    public ClassWithString(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Id:");
        stringBuilder.append(this.id);
        stringBuilder.append(" Name:");
        stringBuilder.append(this.name);
        return stringBuilder.toString();
    }
}