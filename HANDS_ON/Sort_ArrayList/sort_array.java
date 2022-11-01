/*
 WAP to sort Arraylist in descending order.
 */

package Sort_ArrayList;
import java.util.*;
class sort_array {
	
	public static void main(String[]args){
		
		
		ArrayList<String> character = new ArrayList();//using add()method
		character.add("A");
		character.add("B");
		character.add("C");
		character.add("D");
		character.add("E");
		
		System.out.println("characters are:"+character);
		// sort the ArrayList in descending order
		Collections.sort(character,Collections.reverseOrder());
        System.out.println("descending order is:"+character);
		
}
}