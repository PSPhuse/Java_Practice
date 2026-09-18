package IOStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class LargestWord {

    public static void main(String[] args) throws Exception{
        BufferedReader f1 = new BufferedReader(new FileReader("F:\\Java\\C-Dac\\PackageDemo\\src\\text.txt"));
        

        String c = f1.readLine();
        String largets = "";

        while(c != null)
        {
            //System.out.println(c);
            String[] word = c.split(" ");
            for(int i=0;i<word.length;i++)
            {
                if(word[i].length() > largets.length())
                {
                    largets=word[i];
                }

            }
            c = f1.readLine();
        }
        System.out.println("Largerst Number in File is:"+largets+" Length is:"+largets.length());
        f1.close();
    }
}
