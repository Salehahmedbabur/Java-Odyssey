package src.odyssey.java.assignments.class_objects;

public class Depertment {
    String department_name,title,salary;

    public  Depertment() { }


    public  Depertment(String depertment,String title,String salary) {

        this.department_name = depertment;
        this.title = title;
        this.salary = salary;

    }

    public void display(){
        System.out.println("Depertment name "+ department_name);
        System.out.println("title "+ title);
        System.out.println("salary "+ salary);


    }

}
