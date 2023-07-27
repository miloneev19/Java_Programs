//this program is a menu driven program for predicting prime or even odd number 

import java.util.Scanner;
public class primeEven {
	
	public void evenOdd(int n)
	{
		if(n%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
	
	public void prime(int n)
	{	int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Number is prime!");
		}
		else
		{
			System.out.println("Number is Composite");
		}
	}

	public static void main(String[] args) {
	
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter your number");
      int num=sc.nextInt();
       primeEven obj = new primeEven();
       obj.evenOdd(num);
       obj.prime(num);
       System.out.println("--------------Thankyou for Using------------------");
	}

}
