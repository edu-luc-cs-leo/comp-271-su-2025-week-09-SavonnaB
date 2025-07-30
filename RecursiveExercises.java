Public Class RecursiveExercises {    
    // SB: Uses recursion to find the maximum value in a subarray. arr the array is used to search.
    // Left is the starting index and furthest right is the ending.
    // System should print out maximum to minmum value left to right
     
    public static int findMax(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = findMax(arr, left, mid);
        int maxRight = findMax(arr, mid + 1, right);
        return (maxLeft > maxRight) ? maxLeft : maxRight;
    }

    //SB: Reverses array in node, sorts left and right indexes
    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left + 1, right - 1);
    }
    // SB: Counts the amount of times a value appears in array. Uses arr to search item out
    public static int countOccurrences(int[] arr, int target, int index) {
        if (index >= arr.length) return 0;
        int count = (arr[index] == target) ? 1 : 0;
        return count + countOccurrences(arr, target, index + 1);
    }
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == target) return mid;
        else if (target < arr[mid]) return binarySearch(arr, target, left, mid - 1);
        else return binarySearch(arr, target, mid + 1, right);
    }
    // SB: Sorted array binary search that returns target item or -1 if not found
     if (left > right) return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == target) return mid;
        else if (target < arr[mid]) return binarySearch(arr, target, left, mid - 1);
        else return binarySearch(arr, target, mid + 1, right);
     
    // SB: Main Method and test cases
    public static void main(String[] args) {
        int[] sample = {3, 1, 9, 4, 6, 9, 2};
        System.out.println("Max value: " + findMax(sample, 0, sample.length - 1));

        reverseArray(sample, 0, sample.length - 1);
        System.out.print("Reversed array: ");
        for (int n : sample) System.out.print(n + " ");
        System.out.println();

        int count = countOccurrences(sample, 9, 0);
        System.out.println("Occurrences of 9: " + count);

        int[] sorted = {1, 3, 4, 6, 7, 9, 10};
        int index = binarySearch(sorted, 6, 0, sorted.length - 1);
        System.out.println("Index of 6: " + index);
    }
}