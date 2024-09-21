import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out .print("enter the numberof element in the the array");
		int n =sc.nextInt();
		
		int[] array=new int[n];
		
		System.out.println("enter "+n +"integers:");
		for(int i=0;i<n;i++)
		{
			array[i] =sc.nextInt();
		}
			System.out.println("entered array:");
			for(int element :array)
			{
				System.out.println(element);
			}
			sc.close();
			
		
		
				

	}

}
