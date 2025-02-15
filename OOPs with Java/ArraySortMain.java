// Java program to sort an array of integers in ascending and descending order
import java.util.Arrays;

class ArraySorter {
    public int[] sortAscending(int[] arr) {
        int[] sortedArray = arr.clone(); // Clone the array to avoid modifying the original
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public int[] sortDescending(int[] arr) {
        int[] sortedArray = sortAscending(arr);
        for (int i = 0; i < sortedArray.length / 2; i++) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }
        return sortedArray;
    }
}

public class ArraySortMain {
    public static void main(String[] args) {
        // Array sorting
        ArraySorter arraySorter = new ArraySorter();
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Ascending Order: " + Arrays.toString(arraySorter.sortAscending(array)));
        System.out.println("Descending Order: " + Arrays.toString(arraySorter.sortDescending(array)));
    }
}
