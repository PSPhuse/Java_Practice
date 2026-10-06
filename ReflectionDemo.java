//package genericMethod;
import java.lang.reflect.*;
import java.util.*;
public class ReflectionDemo {

    public static void main(String[] args) {
        
        int mcount = 0; //to count Method in class
        int fcount = 0; //to count filds in class

        Thread t = new Thread();           //Pree Define Class
        List al = new ArrayList<>();       
        GenericDemo gd = new GenericDemo();           //User Define Class

        //Class c = t.getClass();          //for Thread Class
        Class c = al.getClass();       //for ArrayList Class 
        
        System.out.println("Fully Qualified Name:"+c);

        Method[] m = c.getDeclaredMethods();    //Create List of Method in Class 
        Field[] f = c.getDeclaredFields();   //Create List Of Fildes 

        for(Method m1:m)
        {
            mcount++;
            System.out.println(m1.getName());
        }
        System.out.println("No of Method in Therad Class:"+mcount);

        System.out.println("================");

        for(Field f1:f)
        {
            fcount++;
            System.out.println(f1.getName());
        }
        System.out.println("Number of Filds in Thread Class:"+fcount);
    }
}