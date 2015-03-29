/**
 * Created by Jalpesh Vadgama on 29-03-2015.
 */
public class SetterAndThis {

    public static void main(String[] args) {

        Frog frog = new Frog();

        frog.setName("Jalpesh Vadgama");
        frog.setAge(35);

        System.out.println(frog.getName());
        System.out.println(frog.getAge());

        Frog anotherFrog = new Frog();
        anotherFrog.setInfo("Vishal Vadgama", 32);
        System.out.println(anotherFrog.getName());
        System.out.println(anotherFrog.getAge());



    }
}

class Frog {

    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
