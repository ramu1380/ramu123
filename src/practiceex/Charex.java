package practiceex;

public class Charex 
{

	public static void main(String[] args) 
	{
		
		char[] c= {'c','w','r','q' };
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length-1;j++)
			{
				if(c[j]>c[j+1])
				{
				 char temp =c[j];
				 c[j]=c[j+1];
				 c[j+1]=temp;
				}
				
				
				
			}
		}
		for(int k=0;k<c.length;k++)
		{
			System.out.println(c[k]);
		}

	}

}
