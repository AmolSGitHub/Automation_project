package Pattern;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) 
	{
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter the value");
		int US = ref.nextInt();
		for(int i=0;i<=US;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print("");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
