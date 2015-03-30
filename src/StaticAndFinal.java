/**
 * Created by Jalpesh Vadgama on 31-03-2015.
 */
public class StaticAndFinal {

    public static void main(String[] args) {

        Thing.name = "Jalpesh Vadgama";
        Thing.description = " I'm description";

        Thing.showName();
        Thing.showDescirption();
    }

}

class Thing {
    public static String name;
    public static String description;

    public static void showName() {
        System.out.println(name);
    }

    public static void showDescirption() {
        System.out.println(description);
    }
}