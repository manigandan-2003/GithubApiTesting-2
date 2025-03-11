```java
LinearSearch.java
```java
import java.util.Arrays;

class LinearSearch {
    public static int linearSearch1D(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int[] linearSearch2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int arr1D[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 5;
        int result = linearSearch1D(arr1D, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        int arr2D[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result2D[] = linearSearch2D(arr2D, target);
        if (result2D[0] == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + Arrays.toString(result2D));
        }
    }
}
```
The provided code was already optimized as much as possible for a linear search.  There's no inherent inefficiency in the `linearSearch1D` and `linearSearch2D` methods beyond the nature of a linear search itself (O(n) time complexity).  To improve performance, a different search algorithm (like binary search for sorted arrays) would be needed.
