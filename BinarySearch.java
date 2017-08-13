public class BinarySearch {
	public int binarySearch (int[] arr, int x) {
		int result = 0;
		int first = 0;
		int last = arr.length - 1;
		while (first <= last) {
			int middle = (first + last) / 2;
			if (x < arr[middle]) {
				last = middle - 1;
			} else if (x > arr[middle]) {
				first = middle + 1;
			} else {
				return middle;
			}
		
		}
		return result;
	}
	
	public static void main(String[] args) {
		BinarySearch b = new BinarySearch();
		int[] arr = {1,3,5,8,10};
		System.out.println(b.binarySearch(arr, 3));
	
	}

}