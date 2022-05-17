package week1.day2;

import java.util.Arrays;

public class Arrayss {
	public static void main(String[] args)
	{	
		int[] arr={10,20,50,40,30};
		int length=arr.length;
		Arrays.sort(arr);
		System.err.println(arr[length-2]);
	}
}
