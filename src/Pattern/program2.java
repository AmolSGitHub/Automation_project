package Pattern;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) 
	{
	  Scanner ref = new Scanner(System.in);
	  System.out.println("Enter the value");
	  int US = ref.nextInt();
	  for(int i =US;i>=1;i--)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(" *");
		  }
		  System.out.println();
		  
	  }

	}

}
