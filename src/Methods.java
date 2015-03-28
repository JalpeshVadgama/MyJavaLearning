/**
 * Created by Jalpesh Vadgama on 29-03-2015.
 */
public class Methods {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.FirstName = "Jalpesh";
        employee.LastName = "Vadgama";
        employee.Designation = "Project Manager";

        employee.Print();

    }

}

class Employee {

    //Declarations
    String FirstName;
    String LastName;
    String Designation;

    void Print() {

        System.out.println(this.FirstName);
        System.out.println(this.LastName);
        System.out.println(this.Designation);

    }
}