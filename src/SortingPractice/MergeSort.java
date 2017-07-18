package SortingPractice;

import java.util.Random;

public class MergeSort {
	public static void main(String[] args){
		Random r = new Random();
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++){
			arr[i] = r.nextInt(10);
			System.out.print(arr[i]+" ");
		}
		mergeSort(arr);
		System.out.println();;
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void mergeSort(int[] arr){
		mergeSortHelper(arr, 0, arr.length-1);
	}
	public static void mergeSortHelper(int[] arr, int low, int high){
		if(low == high){
			return;
		}
		int mid = (low+high)/2;
		mergeSortHelper(arr, low, mid);
		mergeSortHelper(arr, mid+1, high);
		int[] temp = new int[high-low+1];
		int right = mid+1;
		int left = low;
		int i = 0;
		for(; (left<=mid && right<=high); i++)
			if(arr[left] < arr[right])
				temp[i] = arr[left++];
			else
				temp[i] = arr[right++];
		while(left <= mid)
			temp[i++] = arr[left++];
		while(right<=high)
			temp[i++] = arr[right++];
		System.arraycopy(temp, 0, arr, low, temp.length);
	}
}
