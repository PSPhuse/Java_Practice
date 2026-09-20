package Collection;
import java.util.HashSet;

public class Problem4 {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();

        set.add(new Employee(105, "Chota Bheem", "HR",50000));
        set.add(new Employee(135, "Chinchan", "Manager",75000));
        set.add(new Employee(111, "Motu", "Developer",65000));
        set.add(new Employee(36, "Patlu", "Production",30000));
        set.add(new Employee(01, "Doremon", "R&D",100000));

        for(Employee e:set)
            e.getEmployee();   
    }
}
