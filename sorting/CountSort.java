package sorting;

public class CountSort {
	
	static void displayArr(int arr[]) {
		
		for(int val: arr) {
			System.out.print(val + " ");
		}
	}
	
	static int findMax(int arr[]) {
		
		int max =0;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	static void basicCountSort(int arr[]) {
		
		int max = findMax(arr); // find the largest element of the arr;
		
		int [] count = new int[max+1];
		
		for(int i =0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		
		int k =0;
		// to iterate over the final array
		for(int i =0;i<count.length;i++) {
			
			for(int j =0;j<count[i];j++) {
				arr[k++]=i;
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,4,5,2,2,5};
		
		basicCountSort(arr);
		displayArr(arr);
		
		

	}

}
