public class OneDigitSum {
    public static void main(String[] args) 
    {
        OneDigitSum o1=new OneDigitSum();
        int num=Integer.parseInt(args[0]);

        int res=o1.Digit(num);
        if(res>10)
            res=o1.Digit(res);
        
            System.out.println("Result is:"+res);

    }
    int Digit(int n1)
    {
        int n2=0,sum=0;
        while (n1>0)
        {
            n2=n1%10;
            sum=sum+n2;
            n1=n1/10;   
        }
        return sum;
    }
}
