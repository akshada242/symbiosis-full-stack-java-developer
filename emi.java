import java.util.Scanner;
public class Emi {
	public static void main  (String[] args)
	{
		Scanner input = new Scanner(System.in);
		double pri,rate,time,emi;
		System.out.println("enter the value of principle");
		
		pri=input.nextFloat();
		System.out.println("enter the value of rate");
		rate=input.nextFloat();
		System.out.println("enter the value of no of year");
		time=input.nextFloat();
		
		rate=rate/(12*100);
		time=time*12;
		emi=(pri*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
		
		System.out.println("monthly Emi is :"+emi+"\n");
		
		
	}

}
