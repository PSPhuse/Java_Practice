class ArrayProgram
{
	
	public static void main(String[] args) 
	{
		int[] arr=new int[10];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=1+(int)(Math.random()*100);
		}

		System.out.println("1 for Sum & Avg");
		System.out.println("2 for Min & Max");
		System.out.println("3 Search Element");
		System.out.println("4 Sort Array");
		System.out.println("5 Sum of Odd Index");
		System.out.println("6 Sum of half Array");
		System.out.println("7 Find n Element");
		System.out.println("0 For Exit");

		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		while(n!=0)
		{

		switch (n) 
		{
		case 1:
			SumAvg(arr);
			break;
		case 2:
			MinMax(arr);
			break;
		case 3:
			Search1(arr);
			break;
		case 4:
			Sort1(arr);
			break;
		case 5:
			SumOdd(arr);
			break;
		case 6:
			half(arr);
			break;
		case 7:
			nthLarg(arr);
			break;	
		}
		System.out.print("Number tak re bhadvya:");
		n=sc.nextInt();
	}
		// SumAvg(arr);
		// MinMax(arr);
		// Search1(arr);
		// Sort1(arr);
		// SumOdd(arr);
		// half(arr);
		// nthLarg(arr);
	}
	static void SumAvg(int[] arr)
	{
		int sum=0;
		System.out.println("This is Array Element:");
		for(int i:arr)            //Print Array Element
		{
			System.out.print(i+" ");
			sum=sum+i;         //Sum of Element
		}	
		double avg=sum/(double)arr.length;   //Avrage of Element
		System.out.println("\nSum of Array Element is:"+sum);
		System.out.println("Average is:"+avg);
	}

	static void MinMax(int[] arr)
	{
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)  //Find Smallest Element
				min=arr[i];

			if(arr[i]>max)    //Find Largest Element
				max=arr[i];
		}
		System.out.println("Mininum is:"+min);
		System.out.println("Maximun is:"+max);

	}	

	static void Search1(int[] arr)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter NUmber to Search in Array:");
		int find=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(find==arr[i])   //Search Element in array
			{
				System.out.println(+find+" is Present at Index:"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Number is not available in Array!!!");
	}
	static void Sort1(int[] arr)
	{
		java.util.Arrays.sort(arr);  //Sort Array Element
		System.out.print("Sorted Array: ");
		for(int y:arr)
			System.out.print(y+" ");
	}

	static void SumOdd(int[] arr1)
	{
		System.out.println();
		int sum=0;
		for(int i=1;i<arr1.length;i+=2)
		{
			sum=sum+arr1[i];
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\nSum of Odd Index Element in Array:"+sum);
	}
	static void half(int[] arr1)
	{
		int len=arr1.length;
		int sumh,sumlast;
		sumh=sumlast=0;
		for(int i=0;i<len;i++)
		{
			if(i<len/2)
				sumh=sumh+arr1[i];
			else
				sumlast=sumlast+arr1[i];
		}
		System.out.println("Sum of First Half:"+sumh);
		System.out.println("Sum of Last Half:"+sumlast);
	}
	static void nthLarg(int[] arr1)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("\nEnter number of Largest Element:");
		int n=(sc.nextInt()-1);
		java.util.Arrays.sort(arr1);
		System.out.println(arr1[n]);

	}
}