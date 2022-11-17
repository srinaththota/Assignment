package search;

public class BinarySearch {

	public boolean binarySearch(int arr[], int l, int r, int ele)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == ele)
                return true;
            if (arr[mid] > ele) {
                return binarySearch(arr, l, mid - 1, ele);
            }
            else {
            	return binarySearch(arr, mid + 1, r, ele);
            }
        }
 
        return false;
    }
}
