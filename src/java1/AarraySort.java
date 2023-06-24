package java1;

import java.util.Arrays;

public class AarraySort {

	public static void main(String1[] args) 
	{
		int[] n= {1,4,8,12,15};
			
		     Arrays.sort(n);
			System.out.println(Arrays.toString(n));
			System.out.println("2nd smallest no:"  +n[1]);//2nd largest No
			//System.out.println("Total length of Aarray:"  +n.length);
			System.out.println("2nd largest no:"   +n[n.length-2]);
			//print all nos
			for(int i=0;i<n.length;i++)
			{
				if(n[i]!=n[1] && n[i]!=n[n.length-2] )
				{
					System.out.println(n[i]);
				}
			}
		
         
	}

}
