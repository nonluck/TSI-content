package classses;

import java.util.ArrayList;

public class Array {
	private long size = 0;
	public Array(long x) {
		size = ( x > 0 ) ? x : 10;
	}
	public static void main(String[] args)
	{
	int[] array = new int[10];
	ArrayList<Integer> newarray = new ArrayList<Integer>();
	System.out.printf("%s%8s%n", "Index", "Value"); 

	for (int counter = 0; counter < array.length; counter++){
		newarray.add(counter);
		System.out.printf("%5d%8d%n", counter, array[counter]);
	}
	
	

	System.out.println(newarray);
	System.out.printf("%5f%8s%n",43.2,"C");
	System.out.printf("%5s%8s%n","j","i");
	}
}
