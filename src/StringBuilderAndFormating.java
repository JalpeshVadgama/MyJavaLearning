/**
 * Created by Jalpesh Vadgama on 01-04-2015.
 */
public class StringBuilderAndFormating {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Hello World");
        stringBuilder.append(" Jalpesh Vadgama");

        System.out.println(stringBuilder.toString());

        //StringBuffer multiple thread for string builder

        //String Formating
        System.out.printf("Test %10d", 5);

    }
}
