
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment as=new Assignment();
		
		int[] newArr=as.prepare(10);
		
	//	as.selectionSort(newArr);
		//as.displayArray(newArr);
		as.displayArray(newArr);
		//as.insertionSort(newArr);
		as.bubbleSort(newArr);
		as.displayArray(newArr);
	}

}
