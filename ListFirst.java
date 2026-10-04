//package collection.listPackage;

import java.util.*;
public class ListFirst {

    public static void main(String[] args) {
        //Creating an List of raw type it allow (int,string,char,object) & different type of data
        List list = new ArrayList<>();
        
        //Adding element in List through add() Method
        list.add("Kuber");
        list.add("Alpha");
        // list.add(91464);
        // list.add(431132);
        list.add("This is Array List First Program");

        //Insert at Specific Position
        list.add(1,"1st Index");

        //Printing List
        System.out.println("Array List is:"+list);

        //Iterating List
        System.out.println("Iterate List by Iterator ");

        list.remove(2);            //Rempve element by Index Value;

        Iterator e = list.iterator();
        while(e.hasNext())
        {
            System.out.println((String)e.next());
        }

        //Creating Array List By Using Integer Wrapper Class
        //Following List Only Store Integer Value
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(1);
        arrayList.add(15124);
        arrayList.add(789);
        arrayList.add(565);
        arrayList.add(55);

        System.out.println("This is Integer ArrayList:");
        for(int num : arrayList)             //Iterate Using ForEach loop
            System.out.println(num);

        arrayList.sort(null);

    }
}
