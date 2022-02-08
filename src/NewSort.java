import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
					
				}
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println("Sorted array is \n");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
