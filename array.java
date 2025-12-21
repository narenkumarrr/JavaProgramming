import java.util.*;

public class array {
    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        //it will be automatically updated as arrays are static in nature
    }

    public static void main(String args[]) {
        // int arr[] = { 1, 2, 2 };
        // int arr1[] = new int[50];
        int marks[] = new int[20];
        // System.out.println(arr[2]);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        sc.close();
        update(marks);//passing 

        
        System.out.println(marks[0]);
        System.out.println(marks[1]);

    }
}
