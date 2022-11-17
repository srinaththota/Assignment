package search;

public class LinearSearch {

	public static boolean linearSearch(int[] arr,int ele) {
		int res=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return true;
			}
		}
		return false;
	}
}
