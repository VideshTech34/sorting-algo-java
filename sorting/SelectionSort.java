package sorting;

public class SelectionSort {
	
	static void selectionSort(int arr[]) {
		
		int n = arr.length;
		
		for(int i =0;i<n-1;i++) {// i represent the current index
			
			//find the minimum element in unsorted part of array
			
			int min_index = i;
			
			for(int j =i+1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
				min_index=j;
			}
		}
		
	
			// swap current element and minimum element-> current index i will have correct
			// a[min_index],a[i]
			int temp = arr[i];
		arr[i] = arr[min_index];
		arr[min_index]=temp;
		
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7,6,4,3,2};
		
		// calling sort function
		selectionSort(arr);
		
		
		//printing the sort function
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		

	}

}
