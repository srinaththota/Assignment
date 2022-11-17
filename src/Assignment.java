import java.util.Random;

public class Assignment {

	//method to swap variables in an array
	public void swap(int[] arr,int i,int j) {
		
	}
	//to display array on console
	public void displayArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	//method to generate random number
	public int randomize() {
		Random rs=new Random();
		return rs.nextInt(10);
	}
	
	//method to prepare an array which is the length of parameter sent 
	public int[] prepare(int n){
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=randomize();
		}
		return arr;
	}
	public void selectionSort(int[] arr) {
		SelectionSort.sort(arr);
	}
	public void insertionSort(int[] arr) {
		InsertionSort.sort(arr);
	}
	public void bubbleSort(int[] arr) {
		BubbleSort.sort(arr);
	}
}
