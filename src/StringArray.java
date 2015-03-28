/**
 * Created by Jalpesh Vadgama on 29-03-2015.
 */
public class StringArray {

    public static void main(String[] args) {

        String[] words = new String[3];

        words[0] = "First Word";
        words[1] = "Last Word";
        words[2] = "Third Word";

        System.out.println(words[0]);

        String[] fruits = {"Apple", "Mango", "Orange"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}
