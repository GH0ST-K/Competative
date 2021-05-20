/*
                                                                        Binary Searching using Recursion
                                                                                                                                                                                     */
public class binary_search_recurr {
	public static void main(String[] args) {
		int[] arr = {-4, -1, 0, 1, 2, 9, 14, 25, 45, 49, 51, 60};
		int element = -10;
		int position = bin_search(element,0,arr.length/2,arr.length-1,arr);
		String result = ((position >= 0) ? String.valueOf(position) : "NOT FOUND");
		System.out.println(result);
	}
	static int bin_search(int element,int low,int mid,int high,int[] arr) {
		if(mid<low || mid>high)
			return -1;
		if(arr[mid]==element)
			return mid;
		if(element < arr[mid])
			return bin_search(element,low,mid/2,mid-1,arr);
		return bin_search(element,mid+1,mid+(high-mid)/2,high,arr);
	}
}
