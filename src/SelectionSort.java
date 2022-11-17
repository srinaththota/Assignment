import java.util.Date;

public class SelectionSort {

	public static int[] sort(int[] arr) {
		
		System.out.println(new Date());
		Date d1=new Date();
		long before=d1.getTime();
		for(int i=0;i<arr.length;i++) {
			int min_index=i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min_index]>arr[j]) {
					min_index=j;
				}
				int temp=arr[i];
				arr[i]=arr[min_index];
				arr[min_index]=temp;
			}
		}
		System.out.println(new Date());
		Date d2 = new Date();
		long after=d2.getTime();
		System.out.println("Difference is "+(after-before));
		return arr;
	}
}
