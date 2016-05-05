// Author: Namrata Suryavanshi
// Run at: http://ideone.com/1SmfYt


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MyBubbleSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] A = new int[10];
		populateArray(A);

		for(int i: A){
			System.out.print(i + " ");
		}
		
		System.out.println(" ");
		MyBubbleSort mbs = new MyBubbleSort();
		int[] B = mbs.bubbleSort(A);
		for (int i: B){
			System.out.print(i + " ");
		}
	}
	
	public static int[] populateArray(int[] list){
		for (int i = 0; i < list.length; i++){
			list[i] = (int)(Math.random()*10 + 5);
		}
		return list;
	}
	
	public static int[] bubbleSort(int[] list) {
		
		int temp = 0;
		for(int i = 0; i < (list.length - 1); i++) {
			for(int j = 0; j < (list.length - 1 - i); j++) {
				if(list[j] > list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		return list;
	}
}

