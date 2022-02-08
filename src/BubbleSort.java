import java.util.*;
public class BubbleSort {

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
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}		
			}
		}
		System.out.println("Sorted array is \n");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
