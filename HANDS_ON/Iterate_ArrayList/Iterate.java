/*
 WAP to iterate ArrayList.
 */


package ArrayList;
import java.util.*;
class Iterate {
	
	public static void main(String[]args){
		
	
	ArrayList<String> person = new ArrayList();//using add()method
	person.add("swapnali");
	person.add("nivi");
	person.add("monika");
	person.add("bhagyashree");
	person.add("bhakti");
	
	System.out.println("ArrayList is:" +person);//calling iterator ()method
	Iterator<String> person1 = person.iterator();
	
	System.out.println("ArrayList using iterator");
	while(person1.hasNext())//hasnext is method to check next value in the array
	{
		System.out.print(person1.next());
		
		System.out.print(",");
	}

	}
}
