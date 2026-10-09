//package genericMethod;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.*;
public class StreamDemo {
    String name;
    int age;
    double salary;

    StreamDemo(String name,int age,double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public static void main(String[] args) {
        List<StreamDemo> employee = Arrays.asList( 
        new StreamDemo("john", 25, 50000),
        new StreamDemo("Alice", 30 , 30000),
        new StreamDemo("Bob", 35, 70000),
        new StreamDemo("Sam", 28, 45000)
    );
    List<String> highEarners = employee.stream()
                                .filter(e-> e.salary>50000)
                                .map(e->e.name)
                                .collect(Collectors.toList());
        System.out.println("High Earners: " + highEarners);
        //List<String> list = Arrays.asList("A","B");
        //Stream<String> stream1 = list.stream();
    }

}
