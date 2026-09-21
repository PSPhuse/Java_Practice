package IOStream;

import java.io.*;
import java.util.*;

public class DuplicWord {

    static HashMap<String,Integer> list = new HashMap<>();
    public static void main(String[] args) throws FileNotFoundException,IOException {
       BufferedReader br = new BufferedReader(new FileReader("F:\\Assignment-9.txt"));

       String c = "";
       while((c=br.readLine())!=null)
       {
            String[] s = c.toLowerCase().split(" ");
            for(String s1:s)
                list.put(s1,list.getOrDefault(s1,0)+1);
       }
       //System.out.println(list);
       
       for(Map.Entry<String,Integer>enter:list.entrySet())
       {
        if(enter.getValue()>1)
            System.out.println(enter.getKey()+" : "+enter.getValue());
       }

       br.close();
    }
}
