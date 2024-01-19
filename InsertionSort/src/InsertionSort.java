public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Replace this array with your own data
        int[] myArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Original Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        // Apply Insertion Sort
        insertionSort(myArray);

        System.out.print("\nSorted Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
