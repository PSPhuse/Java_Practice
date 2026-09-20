package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Problem1 {

    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(22,"Parshuram",98));
        list.add(new Student(101,"Mayur",78));
        list.add(new Student(204,"Aanand",88));
        list.add(new Student(102, "Mahesh", 65));
        list.add(new Student(01, "Aaditya", 99));

        //Iterate an Object List
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        //Iterate List and Find Higest Gread
        Student higest = list.get(0);
        for(Student s:list)
        {
            s.getStudent();  //Printing Student list
            if(s.gread>higest.gread)
                higest = s;
        }
        System.out.println("Higest Gread of Student is:");
        higest.getStudent();

        //Sort list by Name 
        Collections.sort(list,(s1,s2) -> s1.name.compareTo(s2.name));   //Sorting by Name using Lambda
        for(Student s:list)
            s.getStudent();;  
    }
}