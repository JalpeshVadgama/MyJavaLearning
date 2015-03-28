/**
 * Created by Jalpesh Vadgama on 29-03-2015.
 */
public class Array {

    public static void main(String[] args){

        int[] values = {1,2,3,4,5};
        System.out.println(values[0]);

        int[] anothervalues=new int[3];
        //java by default it will be default value
        System.out.println(anothervalues[0]);

        System.out.println("Printing array value");

        for (int i = 1; i < values.length+1; i++) {
            System.out.println(i);
        }

    }
}
