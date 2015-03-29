/**
 * Created by Jalpesh Vadgama on 29-03-2015.
 */
public class GettersAndReturn {
    public static void main(String[] args) {

        AnotherEmployee employee = new AnotherEmployee();
        employee.name = "Jalpesh Vadgama";
        employee.age = 35;

        System.out.println(employee.getAge());

        int yearLeft = employee.calculateYearsToRetirement();
        System.out.println(yearLeft);
    }
}

class AnotherEmployee {
    String name;
    int age;

    int calculateYearsToRetirement() {
        return 65 - age;
    }

    int getAge() {
        return age;
    }
}