package practiceex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Altimetrik 
{

	public static void main(String[] args) 
	{
		int a[]= new int[] { 10,90,10,30,70,50};
	
		HashMap<Integer,Integer>ha = new HashMap<Integer,Integer>();
		for(int k:a) {
			if(ha.containsKey(k))
			{
				ha.put(k, ha.get(k)+1);
				
			}
			else
			{
				ha.put(k,1);
			}
		}
		int k;
		System.out.println(ha);
		for(Map.Entry<Integer,Integer> e:ha.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}
		}
