package multi_Threading;

import java.io.*;

public class WordCount {

    public void fileOne() throws FileNotFoundException,IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("F:\\Assignment-9.txt"));

        String s = " ";
        int word = 0;
        
        while((s=br.readLine()) != null)
        {
            String[] str = s.split(" ");

            word = str.length+word;
        }
        System.out.println("Count of Word In File One:"+word);
        br.close();
    }

    public  void fileTwo() throws IOException,FileNotFoundException
    {
        FileReader br1 = new FileReader("F:\\Assignment_Java-SE-3.pdf");

        int c = 0;
        int word = 0;
        int line = 0;
        while((c=br1.read()) != -1)
        {
            if((char)c == ' ')
                word++;
            if((char)c == '\n')
                line++;
        }
        System.out.println("Count in File Two is:"+word+line);
        System.out.println("Lines:"+line);
        br1.close();
    }
    public static void main(String[] args) throws FileNotFoundException,IOException {
        
        WordCount count = new  WordCount();

        Thread t1 = new Thread()
        {
            public void run()
            {
                try{
                    count.fileOne();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                
            }  
        };

        Thread t2 = new Thread()
        {
            public void run()
            {
                try{
                    count.fileTwo();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                } 
            }  
        };
        t1.start();
        t2.start();
    }
}
