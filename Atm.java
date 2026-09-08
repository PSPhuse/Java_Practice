import java.util.Scanner;

public class Atm 
{
    
    public static void main(String[] args) 
    {
        Bank obj=new Bank();
        obj.Wel();
        System.out.println("Thank You for Visiting Us...!!!");
    }
     
}
class Bank
{
    Scanner sc=new Scanner(System.in);
    double balance=100000;

    void Wel()
    {
        int pass=1234;
        System.out.println("****Welcome to ATM Services****");
        System.out.print("Enter your 4 Digit pin:");
        int pass1=sc.nextInt();
        if(pass1==pass)
            choice();
        else
            System.out.println("Enter Correct Password");
    }
    void choice()
    {
        System.out.println("===============================");
        System.out.println("Enter 1 for Deposite");
        System.out.println("Enter 2 for Withdrow");
        System.out.println("Enter 3 for Chack Balance:");

        int ch1=sc.nextInt();
        
            switch (ch1) 
            {
                case 1:
                    Withdrow(balance);
                    break;
                case 2:
                    Deposite(balance);
                    break;
                case 3:
                    check();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
    }
    void Withdrow(double b1)
    {
        System.out.println("Enter Amount:");
        int a1=sc.nextInt();
        balance=balance-a1;
        System.out.println("Transection Succesfull");
        System.out.println("You Want to Check Balance Press 1\nTo Exit Press 2");
        int i=sc.nextInt();
        if (i==1)
            check();
    }
    void Deposite(double b2)
    {
        System.out.println("Enter Amount:");
        int a2=sc.nextInt();
        balance=a2+balance;
        System.out.println("Tranction Succesfull");
        System.out.println("You Want to Check Balance Press 1\nTo Exit Press 2");
        int i=sc.nextInt();
        if (i==1)
            check();
    }
    void check()
    {
        System.out.println("Bank Balance is:"+balance);
    }
}
