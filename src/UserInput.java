import java.util.Scanner;

/**
 * Created by Jalpesh Vadgama on 28-03-2015.
 */
public class UserInput {
    public static void main(String[] args){
        Scanner userInput=new Scanner(System.in);

        String line =userInput.nextLine();
        System.out.println("You entered: " + line);

    }
}
