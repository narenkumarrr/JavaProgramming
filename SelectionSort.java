public class SelectionSort {
    public static void SelectionSorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {// last element will be biggest
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        SelectionSorting(arr);
    }
}
