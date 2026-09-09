import java.util.Scanner;

public class Random1 {
    public static void main(String[] args) {
        int no1=0;
        Scanner sc=new Scanner(System.in);
        int ran=1+(int)(Math.random()*99);

        System.out.println(ran);

        while (no1!=ran)
        {
            System.out.print("Guess a Number:");
            no1=sc.nextInt();
            if(no1>ran)
            {
                System.out.println("You enter Higher number");
        
            }
            else if(no1<ran)
            {
                System.out.println("You enter Lower number");
            }
            else
            {
                System.out.println("Congrats this is number...!!!");
                return;
            }
        }
    }
}
