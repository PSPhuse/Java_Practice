public class Employee {

    protected  String eName;
    protected  double salary;

    public Employee(String eName, double salary)
    {
        this.eName = eName;
        this.salary = salary;
    }
    public void displayEmployee()
    {
        System.out.println("Name of Employee:"+eName);
        System.out.println("Salary:"+salary);
    }
}
