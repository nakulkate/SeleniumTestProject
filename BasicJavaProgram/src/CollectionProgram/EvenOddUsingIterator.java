package CollectionProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenOddUsingIterator {
       public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(21);
		al.add(22);
		al.add(23);
		al.add(24);
		al.add(25);
		al.add(26);
		
		Iterator i= al.iterator();
		
		while (i.hasNext())
		{
			int a= (int) i.next();
			if (a%2==0)       // for even
			//if (a%2!=0)        for odd
			{
			System.out.println("Even Number="+a);
			}
			else
			{
			i.remove(); 
			}
		}
		System.out.println(al);
	}
}
