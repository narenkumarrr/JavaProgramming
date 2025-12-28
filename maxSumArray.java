public class maxSumArray {
    // kadanes will be done later.
    // 🔹 Method 1: Brute Force Approach
    // Time Complexity: O(n^2)
    public static void maxSubArrayBruteForce(int arr[]) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;

            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("Maximum Subarray Sum (Brute Force) = " + maxSum);
    }

    // Method 2: Prefix Sum Approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void maxSubArrayPrefixSum(int arr[]) {

        int n = arr.length;
        int prefix[] = new int[n];

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int currSum;
                if (i == 0) {
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }

                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("Maximum Subarray Sum (Prefix Sum) = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };

        maxSubArrayBruteForce(arr);
        maxSubArrayPrefixSum(arr);
    }
}
