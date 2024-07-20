package javaPackage;

public class _191DArray_Cabinet 
{
	public static void main(String[] args) 
	{
		String[] cabinet = new String[4];
		
		cabinet[0] = "socks";
		cabinet[1] = "underwear";
		cabinet[2] = "shirts";
		cabinet[3] = "suits";
		
		System.out.println("The contents of the cabinet are: ");
		
		int i = 0;
		while(i < cabinet.length)
		{
			System.out.println(cabinet[i]);
			i++;
		}
	}

}
