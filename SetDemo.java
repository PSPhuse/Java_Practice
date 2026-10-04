//package collection.setPackage;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        //Hash Set
        //Not allow Duplicate Value
        Set<Integer> hashset = new HashSet<>();
        hashset.add(1);
        hashset.add(45);
        hashset.add(78);

        System.out.println(hashset.contains(45));  //check value is available in set or not
        System.out.println(hashset.remove(78));   //remove the element
        System.out.println(hashset.size());   //return the size of element
        
        
        System.out.println(hashset);   //Print set, but not contain insersion order

        //LinkedHash Set
        Set<String> linkedset = new LinkedHashSet<>();
        //main difference is it contain insersion Order
        //newrly same working as HashSet
        Set<String> linkedset1 = new LinkedHashSet<>();
        //linkedset.addAll(List.Of("name","Age","Address"));
        System.out.println(linkedset.addAll(linkedset1));

        //TreeSet
        TreeSet<Integer> treeset = new TreeSet<>();
        //Contain Natural Sorting Order
        //
        treeset.add(45);
        treeset.add(35);
        treeset.add(12);
        treeset.add(69);
        treeset.add(47);
        System.out.println(treeset);
        System.out.println(treeset.tailSet(45));
        System.out.println(treeset.headSet(45));
        System.out.println(treeset.clone());

        System.out.println(treeset.getFirst());
        System.out.println(treeset.getLast());
        System.out.println(treeset.last());
        System.out.println(treeset);
        System.out.println(treeset.subSet(20, 50));

        
    }

}
