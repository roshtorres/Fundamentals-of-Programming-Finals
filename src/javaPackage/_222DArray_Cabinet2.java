package javaPackage;

public class _222DArray_Cabinet2 
{
	public static void main(String[] args) 
	{
		String[][] cabinet2 = {{"gadgets", "pliers"},
												{"documents", "CDs"},
												{"manuals", "candies"}};
		
		int layer, sub;
		
		for(layer = 0; layer < cabinet2.length; layer++) //cabinet2.length is equal to 3
		{
			for(sub = 0; sub < cabinet2[layer].length; sub++)
			{
				System.out.println("Layer " + layer + " and " + 
													"sub " + sub + " has " +
													cabinet2[layer][sub]);
			}
			System.out.println();
			}
		}

	}
