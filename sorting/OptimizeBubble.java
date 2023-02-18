package sorting;

public class OptimizeBubble {
	
	static void bubble(int arr[]) {
		
		int n = arr.length;
		
		for(int i =0;i<n-1;i++) {
			boolean flag = false;//has any swapping happened
			
			for(int j =0;j<n-i-1;j++) {
				
	if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					
					flag = true;//some swap has happened
					
				}
				
				
			}
			if(flag==false) {
				//have any swaps happened
				return;
				
		
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr[] = {1,2,3,4,5,6};
		
		bubble(arr);
		
		for(int i: arr) {
			System.out.println(i + " ");
		}

	}

}
