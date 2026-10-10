//package collection.listPackage;
import java.util.*;
public class StudentList {
    private int id;
    private String name;
    private int marks;
    private double gread;

    public StudentList(int id,String name,int marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;   
    }
    public void getStudent()
    {
        System.out.println("Id:"+id+" Name:"+name+" marks:"+marks);
        //System.out.println("++++++++++++++++++++++");
    }

    // void main()
    // {
    //     Collections.sort(id,(a,b) -> a.compareTo(b));
    // }
    public static void main(String[] args) {
        
        List<StudentList> list = new ArrayList<>();
        list.add(new StudentList(101, "Parshuram", 85));
        list.add(new StudentList(100, "Mahesh", 88));
        list.add(new StudentList(56, "Aditya", 56));
        list.add(new StudentList(66, "Mayur", 80));

        // Iterator itr = list.iterator();
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        // }

        //Iterate List and Print Entire record
        for(StudentList s:list)
        {
            s.getStudent();
        }
        //Find the higest mark student and above 75 marks Student
        System.out.println("==============Student Got more than 75 Marks");
        StudentList highest = list.get(0);
        for(StudentList l1: list)
        {
            if(l1.marks>=75)
                l1.getStudent();
                highest = l1;
        }
        System.out.println("Greater Than 75 Marks is:");
        highest.getStudent();
        //Sort record By Name
        System.out.println("Sort Student by Name:");
        list.sort((a,b)->a.name.compareTo(b.name));
        for(StudentList s1:list)
        {
            s1.getStudent();
        }
        //Sort Record By Marks
        System.out.println("Sorted by Marks:");
        list.sort((a,b)->a.marks - b.marks);
        for(StudentList s1:list)
        {
            s1.getStudent();
        }
        //To Sort Records According to ID
        System.out.println("Sorted by ID:");
        list.sort((a,b)->a.id - b.id);
        for(StudentList s1:list)
        {
            s1.getStudent();
        }
/* 
        //To Delete record By ID
        StudentList std;
        int i = 0;
        System.out.println("Enter Id to Delete Record");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        i = sc.nextInt();
        System.out.println("Id Removed:"+list.remove(std -> std.id == id));
*/    
    }
}