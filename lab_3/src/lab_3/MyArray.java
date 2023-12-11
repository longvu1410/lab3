package lab_3;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	// Output: 3
	public int iterativeLinearSearch(int target) {
		int[] arr1 = this.array;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == target) {
				return i;
			}
		}

		return -1;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
	// Output: -1
	public int recursiveLinearSearch(int target) {
		    return recursiveLinearSearch(target, 0);
		}

		private int recursiveLinearSearch(int target, int startIndex) {
		    if (startIndex >= array.length) {
		        return -1;  // Trả về -1 nếu không tìm thấy mục tiêu trong mảng
		    }

		    if (array[startIndex] == target) {
		        return startIndex;  // Trả về chỉ mục nếu tìm thấy mục tiêu tại chỉ mục hiện tại
		    }

		    // Gọi đệ quy để tìm kiếm phần còn lại của mảng
		    return recursiveLinearSearch(target, startIndex + 1);
		}


	public static void main(String[] args) {
		int[] arr1 = { 12, 10, 9, 45, 2, 10, 10, 45, 45 };
		int[] array = {12, 10, 9, 45, 2, 10, 10, 45};
		MyArray  arr2 = new MyArray (arr1);
		MyArray  arr3 = new MyArray (array);
		System.out.println(arr2.iterativeLinearSearch(45));
		System.out.println(arr3.recursiveLinearSearch(15));
	}
	// To find the index of the target in the sorted array. If the target is not
		// found in the array, then the method returns -1.
		public int iterativeBinarySearch(int target) {
		    int left = 0;
		    int right = array.length - 1;

		    while (left <= right) {
		        int mid = left + (right - left) / 2;

		        if (array[mid] == target) {
		            return mid;  // Trả về chỉ mục nếu tìm thấy mục tiêu
		        }

		        if (array[mid] < target) {
		            left = mid + 1;
		        } else {
		            right = mid - 1;
		        }
		    }

		    return -1;  // Trả về -1 nếu không tìm thấy mục tiêu
		}

		// To find the index of the target in the sorted array. If the target is not
		// found in the array, then the method returns -1.
		public int recursiveBinarySearch(int target) {
			// TODO
			return 0;

}
}
