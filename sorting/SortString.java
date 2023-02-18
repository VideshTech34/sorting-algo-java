package sorting;

import java.util.Arrays;

public class SortString {
	
	static void fruitsSort(String[] fruits) {
		
		int n = fruits.length;
		
		for(int i =0;i<n-1;i++) {
			
			int min_index = i;
			
			for(int j =i+1;j<n;j++) {
				if(fruits[j].compareTo(fruits[min_index])<0) {
					
					min_index =j;
					
				}
			}
			
			//swap fruits[min_index],fruits
			
			String temp = fruits[i];
			fruits[i] = fruits[min_index];
			fruits[min_index]=temp;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruits = {"kiwi", "apple","mango","guava","banana"};
		
		fruitsSort(fruits);
		
		for(String val:fruits) {
			
			System.out.println(val + "");
		}
	}

}
