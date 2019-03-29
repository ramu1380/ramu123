package practiceex;

import java.util.Scanner;

public class Charrepeat 
{

	public static void main(String[] args) 
	{
		// take any string from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String x = sc.nextLine();
		char[] d = x.toLowerCase().toCharArray();
		int n = d.length;
		int a[]= new int[x.length()];
		char b[]=new char[x.length()];

		for (int i = 0; i < x.length(); i++)
		{
			int k = 0;
			for (int j = 0; j < x.length(); j++) 
			{

				if (x.charAt(i) == x.charAt(j)) 
				{
					k++;
				}
			}
		if(k==1)
			{
			System.out.println("non repeated chars  " + x.charAt(i));
			} 
			 if(k>1)
			{
				a[i]=k;
				b[i]=x.charAt(i);
				for(int j=n;j>0;j--)
				{
					if( j==k)
					{
						System.out.println(k+ "repeated character is" +a[j]);
					}
				}
			}
		}

	}

}
