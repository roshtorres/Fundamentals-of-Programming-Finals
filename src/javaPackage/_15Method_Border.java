package javaPackage;

public class _15Method_Border 
{
	public static void main(String[] args) 
	{
		printBorder();
		System.out.println("Java Rocks!");
		printBorder();
	}
	public static void printBorder()
	{
		int x;
		
		for(x = 1; x <= 10; x++)
		{
			System.out.print("=");
		}
		System.out.println();
	}
}
