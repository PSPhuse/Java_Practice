package Collection;

public class Employee {

    int id;
    String name;
    String dept;
    double salary;

    public Employee(int id,String name,String dept,double salary)
    {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public void getEmployee()
    {
        System.out.println("Id:"+id+" Name:"+name+" Salary:"+salary+" Department:"+dept);
        System.out.println("===================");
    }
}