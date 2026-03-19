/*(For the following problems, you should be printing the whole ArrayList to make sure it worked)

1. Instantiate an empty ArrayList that could have any type in it.

2. Instantiate an empty ArrayList called intArrList that specifically stores Integers. 
Repeat this for Strings.

3. Add 1, 2, and 3 to your intArrList one at a time so that its values are {1, 2, 3}. 
Then add elements to stringArrList so its values are {"Alice , "Bob" , "Charlie"}

4. Add 5 to your intArrList so that its values are now {1, 2, 5, 3}. Then add "Derek"
 to your stringArrList so its values are {"Alice" , "Derek" , "Bob" , "Charlie"}

5. Print out the second and last elements in both intArrList and stringArrList.

6. Change the first element in intArrList to 0, and change the first element in stringArrList to "Zero".
 Print out the first element in each array before and after the change. 

7. Delete the last element in both arrays. Print out what that removed element was. 
*/

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		//2
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		ArrayList<String> intStringList = new ArrayList<String>();
		
		//3
		intArrList.add(1);
		intArrList.add(2);
		intArrList.add(3);
		
		intStringList.add("Alice");
		intStringList.add("Bob");
		intStringList.add("Charlie");
		
		//4
		intArrList.add(2, 5);
		intStringList.add(1, "Derek");
		
		//5
		System.out.println(intArrList.get(1));
		System.out.println(intStringList.get(1));
		
		System.out.println(intArrList.size()-1);
		System.out.println(intStringList.size()-1);
		
		//6
		System.out.println(intArrList.get(0));
		System.out.println(intStringList.get(0));
		
		intArrList.set(0, 0);
		intStringList.set(0, "Zero");
		
		System.out.println(intArrList.get(0));
		System.out.println(intStringList.get(0));
		
		//7
		System.out.println(intArrList.remove(intArrList.size()-1));
		System.out.println(intStringList.remove(intStringList.size()-1));
		
	}

}
