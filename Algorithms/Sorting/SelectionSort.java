import java.util.Arrays;

//Assumption:
//1. not null; len > 0;
//Solution:
//1. loop through array(0, n - 1);
//2. each time, find local min and swap to the left most.
// time: O(n ^ 2)
// space: O(1)

/**
 * Selection Sort Array
 * Description
 * Given an array of integers, sort the elements in the array in ascending order. The selection sort algorithm should be used to solve this problem.
 *
 * Examples
 * {1} is sorted to {1}
 * [4, 2, -3, 6, 1] is sorted to [-3, 1, 2, 4, 6] assending order
 */

public class SelectionSort {
    public int[] selectionSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int localMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[localMin]) {
                    localMin = j;
                }
            }
            swap(array, i, localMin);
        }
        return array;
    }
    
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public void test() {
        int[] testArray = new int[]{4, 2, -3, 6, 1};
        System.out.println(Arrays.toString(selectionSort(testArray)));
    }
    
    public static void main(String[] args) {
        SelectionSort solution = new SelectionSort();
        solution.test();
    }
    
}




