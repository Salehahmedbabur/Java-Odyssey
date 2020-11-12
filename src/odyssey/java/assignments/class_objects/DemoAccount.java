package src.odyssey.java.assignments.class_objects;

public class DemoAccount {

    public static void main(String[] args) {

        Employee_info emp1 = new Employee_info(); // for no values
        Employee_info emp2 = new Employee_info("khaled","vhai"); // for two argument
        Employee_info emp3 = new Employee_info("khaled","vhai","10*10-1910"); // for 3 argument
        Employee_info emp4 = new Employee_info("khaled","vhai"); // for 4 argument
        Employee_info emp5 = new Employee_info("khaled","vhai","10*10-1910","IT","QA"); // for 5 argument
        Employee_info emp6 = new Employee_info("khaled","vhai","10*10-1910","IT","QA","$10000000"); // for 6 argument

        emp6.display();

    }

}
// this program is wrong !!!
