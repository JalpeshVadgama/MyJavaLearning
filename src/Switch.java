import java.util.Scanner;

/**
 * Created by Jalpesh Vadgama on 29-03-2015.
 */
public class Switch {

    public static  void main(String[] args){

        Scanner input =new Scanner(System.in);

        System.out.println("Please enter command for machine:");
        String text = input.nextLine();

        switch (text){
            case "Start":
                System.out.println("Machine Started");
                break;
            case "Stop":
                System.out.println("Machine not started");
                break;
            default:
                System.out.println("It's not a valid command");
                break;
        }


    }

}
