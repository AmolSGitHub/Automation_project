package Pattern;

import java.util.Scanner;

public class program1
{

	public static void main(String[] args)
	{
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter the value");
		int us = ref.nextInt();
		for(int i=0;i<=us;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
			  
			  
			