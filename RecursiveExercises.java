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
}