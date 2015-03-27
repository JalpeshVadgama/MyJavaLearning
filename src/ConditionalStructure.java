/**
 * Created by Jalpesh Vadgama on 28-03-2015.
 */
public class ConditionalStructure {

    public static void main(String[] args){

        boolean condition = 4 < 2;
        System.out.println(condition);

        condition = 4==2;
        System.out.println(condition);

        //If statement
        if(4 < 5){
            System.out.println("Condition is true");
        }

        int number =20;
        if(number < 10) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //if-else-if
        if(number < 10) {
            System.out.println("It's less than 10");
        }
        else if (number < 30) {
            System.out.println("It's greater than 10");
        }
        else{
            System.out.println("None of the above");
        }

    }
}
