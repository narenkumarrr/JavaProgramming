public class binarySearch {

    public static int binarySearchh(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid; // key found
            } else if (arr[mid] < key) {
                start = mid + 1; // search right
            } else {
                end = mid - 1; // search left
            }
        }
        return -1; // key not found
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        int key = 10;

        int result = binarySearchh(arr, key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }
}
