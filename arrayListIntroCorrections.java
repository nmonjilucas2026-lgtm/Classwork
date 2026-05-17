import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		//1 - Empty ArrayList that can store any type
		ArrayList<Object> anyTypeList = new ArrayList<Object>();

		//2 - ArrayLists for Integers and Strings
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		ArrayList<String> stringArrList = new ArrayList<String>();
		
		//3 - Add values to intArrList and stringArrList
		intArrList.add(1);
		intArrList.add(2);
		intArrList.add(3);
		
		stringArrList.add("Alice");
		stringArrList.add("Bob");
		stringArrList.add("Charlie");
		
		System.out.println(intArrList);
		System.out.println(stringArrList);
		
		//4 - Insert 5 and Derek into specific indexes
		intArrList.add(2, 5);
		stringArrList.add(1, "Derek");
		
		System.out.println(intArrList);
		System.out.println(stringArrList);
		
		//5 - Print second and last elements
		System.out.println(intArrList.get(1));
		System.out.println(stringArrList.get(1));
		
		System.out.println(intArrList.get(intArrList.size() - 1));
		System.out.println(stringArrList.get(stringArrList.size() - 1));
		
		//6 - Print first elements before and after changes
		System.out.println(intArrList.get(0));
		System.out.println(stringArrList.get(0));
		
		intArrList.set(0, 0);
		stringArrList.set(0, "Zero");
		
		System.out.println(intArrList.get(0));
		System.out.println(stringArrList.get(0));
		
		System.out.println(intArrList);
		System.out.println(stringArrList);
		
		//7 - Remove and print last elements
		System.out.println(intArrList.remove(intArrList.size() - 1));
		System.out.println(stringArrList.remove(stringArrList.size() - 1));
		
		System.out.println(intArrList);
		System.out.println(stringArrList);
		
	}

}
