package collection.list;

import java.util.ArrayList;

public class listWithJava {

	public static void main(String[] args) {
		//initial capacity of an array list is 10 .
		//when the internal array is full it( re-sizes )creates an new array of  1.5 time old array
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Priyanka ");
		list.add("Xyz ");
		list.add("java ");
		
		
		System.out.println("Element at index 1:"+list.get(1));
		System.out.println("List size :"+list.size());
		list.stream().forEach(System.out::print);
		
		System.out.println("Is list contains java :"+list.contains("java"));
		System.out.println("Is list contains xyz :"+list.contains("xyz"));
		
		list.add(2, "abc");
		System.out.println("added abc at inxed 2"+list);
		list.set(0, "a");
		System.out.println("set a at  index 0"+list);
		
	}
}
