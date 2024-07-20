package javaPackage;
import java.util.Scanner;

public class _18Methods_CoffeeVendo 
{
	public static void main(String[] args) 
	{
		double money = 0.0;
		money = acceptMoney();
		
		if(isMoneyEnough(money))
		{
			dispenseCoffee();
		}
		else
		{
			notify("Money not enough");
		}
		
		if(money > 1.50)
		{
			System.out.println("\nYour change is " + issueChange(money) + " dollar");
		}
	}
	
	public static double acceptMoney()
	{
		Scanner input = new Scanner(System.in);
		
		double payAmount = 0.0;
		
		System.out.print("Enter money: ");
		payAmount = input.nextDouble();
		
		return payAmount;
	}
	
	public static boolean isMoneyEnough(double myMoney)
	{
		if(myMoney >= 1.50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
		public static void dispenseCoffee()
		{
			System.out.println("Coffee is served");
		}
		
		public static void notify(String message)
		{
			System.out.println(message);
		}
	
		public static double issueChange(double payment)
		{
			double change = 0.0;
			
			change = payment - 1.50;
			
			return change;
		}
		
}
