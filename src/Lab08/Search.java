package Lab08;

public class Search {
	public static int LENGTH = 100000;
	public static int key = 100001;
	public static void main(String[] args){
		
		int[] arr = new int[LENGTH];
		for(int i: arr)
			arr[i] = (int) Math.round(Math.random()*100000);
		int index;
		double startTime = System.currentTimeMillis();
		index = binarySearch(arr, key);
		double endTime = System.currentTimeMillis();
		double executionTime = endTime - startTime;
		System.out.printf("Binary search time -> %.10f",executionTime);
		System.out.println("");
		startTime = System.currentTimeMillis();
		index = linearSearch(arr, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.printf("Linear search time -> %.10f",executionTime);
	}
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
			}
		return -low - 1; 
	}
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
			}
		return -1;
	}
}
