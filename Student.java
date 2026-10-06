//package collection.listPackage;
import java.util.*;
public class Student {
    private int id;
    private String name;
    private int marks;
    private double gread;

    public Student(int id,String name,int marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;   
    }
    public void getStudent()
    {
        System.out.println("Id:"+id+"Name:"+name+"marks:"+marks);
        System.out.println("++++++++++++++++++++++");
    }

    // void main()
    // {
    //     Collections.sort(id,(a,b) -> a.compareTo(b));
    // }
    public static void main(String[] args) {
        
        List<Student> list = new ArrayList<>();
        list.add(new Student(101, "Parshuram", 35));
        list.add(new Student(100, "Mahesh", 88));
        list.add(new Student(56, "Aditya", 56));
        list.add(new Student(66, "Mayur", 80));

        // Iterator itr = list.iterator();
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        // }

        for(Student s:list)
        {
            s.getStudent();
        }
        
        Student highest = list.get(0);
        for(Student l1: list)
        {
            if(l1.marks>75)
                highest = l1;
        }
        System.out.println("Greater Than 75 Marks is:");
        highest.getStudent();
        
        // for(Student s1:list)
        // {
        //     if(s1.marks=>75)
        // }
        
    }

}
