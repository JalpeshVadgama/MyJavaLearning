import java.util.Scanner;

/**
 * Created by Jalpesh Vadgama on 28-03-2015.
 */
public class DoWhile {

    public static void main(String[] args){

        Scanner input =new Scanner(System.in);

        int value;
        do{
            System.out.println("Please enter some value");
            value = input.nextInt();
        }
        while (value!=5);
        System.out.println("Yeah the value you entered is 5");

    }
}

