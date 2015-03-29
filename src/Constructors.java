/**
 * Created by Jalpesh Vadgama on 29-03-2015.
 */
public class Constructors {

    public static void main(String[] args) {

        Machine machine1 = new Machine();

        Machine machine2 = new Machine();

        Machine machine3 = new Machine("Lenovo", 10);
        machine3.getInfo();

    }
}

class Machine {

    private String company;
    private int parts;


    public Machine() {
        System.out.println("Public constructor of machine");
    }

    public Machine(String message) {
        System.out.println("Parameterised Constructor and here is message :" + message);
    }

    public Machine(String company, int parts) {
        System.out.println("Parameter Constructor with assignment");
        this.company = company;
        this.parts = parts;
    }

    public void getInfo() {
        System.out.println("Company:" + this.company);
        System.out.printf("Parts: %d%n", this.parts);
    }
}
