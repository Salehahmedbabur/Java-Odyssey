package src.odyssey.java.assignments.class_objects;

public class Employee_info extends Depertment{
    String first_name,last_name,dob,depertment,title;

    public Employee_info() {
        System.out.println("employee info-------");
    }

    public Employee_info(String f_name, String l_name) { }

    public Employee_info(String f_name,String l_name,String dob) { }

    public Employee_info(String f_name,String l_name,String dob,String depertment) { }

    public Employee_info(String f_name,String l_name,String dob,String depertment,String title) { }

    public Employee_info(String f_name,String l_name,String dob,String depertment,String title,String salary) {
        super(depertment,title,salary);
        this.first_name = f_name;
        this.last_name= l_name;
        this.dob = dob;

    }

    private void full_name(){
        System.out.println("NAME :"+first_name+" "+ last_name);

    }

    public void display(){

        full_name();
        System.out.println("Date of birth  "+ dob);
        super.display();


    }

}
