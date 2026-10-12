import java.util.Scanner;
public class Sum0f_2D {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row Number:");
        int n1=sc.nextInt();
        System.out.print("Enter Column Number:");
        int n2=sc.nextInt();

        int[][] a1=new int[n1][n2];
        int[][] a2=new int[n1][n2];
        int[][] res=new int[n1][n2];

        //1ts Array
        System.out.println("This is 1st Array");
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<n2;j++)
            {
                a1[i][j]=1+(int)(Math.random()*100);
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        // 2nd Array 
        System.out.println("This is 2nd Array");
        for(int i=0;i<a2.length;i++)
        {
            for(int j=0;j<n2;j++)
            {
                a2[i][j]=1+(int)(Math.random()*100);
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
    
        System.out.println("Addition of Array");
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                res[i][j]=a1[i][j]+a2[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();  
        }
    }
}
