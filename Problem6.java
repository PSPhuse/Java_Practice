package Collection;
import java.util.TreeSet;

public class Problem6 {
    public static void main(String[] args) {
        TreeSet<Employee> employee = new TreeSet<>((e1,e2) -> e1.name.compareTo(e2.name));

        employee.add(new Employee(105, "Chota Bheem", "HR",50000));
        employee.add(new Employee(135, "Chinchan", "Manager",75000));
        employee.add(new Employee(111, "Motu", "Developer",65000));
        employee.add(new Employee(36, "Patlu", "Production",30000));
        employee.add(new Employee(01, "Doremon", "R&D",100000));

        System.out.println("Sorted Set:");   //Print Tree Set
        for(Employee e:employee)
            e.getEmployee();
        
        String r1 ="Motu";
        employee.removeIf(b -> b.name == r1);   //Remove element by name
        System.out.println("Before Removed");
        for(Employee e:employee)
            e.getEmployee();

        String n1 = "Patlu";
        boolean flag = false;
        for(Employee e:employee)  //Search Employee by there name
        {
            if(e.name == n1)
            {
                System.out.println("Searched Result:");
                e.getEmployee();
                flag=true;
            }
        }
        if(flag==false)
            System.err.println("Employee not found");
    }
}