/*5. Write a multi threaded Java program to print prime numbers between 1 to 1000 and Fibonacci series  unto 1000 using
 two separate threads and find common numbers  using the third thread. */

package multi_Threading;

import java.util.ArrayList;
import java.util.Iterator;

public class MultipleThread {
    ArrayList<Integer> primeNumber = new ArrayList<>();

    int count = 0;
    public synchronized void prime()
    {
        System.out.println("This is Prime Number");
        for(int i=1;i<=1000;i++)
        {
            count = 0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count<=2)
            {
                //System.out.print(i+" ");
                primeNumber.add(i);
            }
        }
        System.out.println(primeNumber);
        System.out.println("=======================");    }
    
    ArrayList<Integer> febo = new ArrayList<>();
    public synchronized void febonassi()
    {
        System.out.println("This is Febonachi Series");
        int a = 0;
        int b = 1;
        int next = 0;

        for(int i=1; i<=1000;i++)
        {
            febo.add(a);
            //System.out.print(a+" ");
            next = a+b;
            a = b;
            b = next;
        }
        Iterator iter = febo.iterator();
        while(iter.hasNext())
            System.out.print( iter.next()+" ");

        System.out.println("=======================");
    }
    public synchronized void duplicate()
    {
        System.out.println("This is Duplicate Number");
        for(int num:primeNumber)
        {
            if(febo.contains(num))
            {
                System.out.println(num);
            }
        }
    }
}
