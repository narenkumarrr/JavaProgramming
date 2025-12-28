public class subArray {
    public static void subArrayy(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("(" + arr[i] + ")\t");

            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i]);

                for (int k = i + 1; k <= j; k++) {
                    System.out.print("," + arr[k]);
                }
                System.out.print(") \t");
            }

            System.out.println(); 
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        subArrayy(arr);
    }
}
