public class allPrimesInRange {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int range = 100;
        for (int num = 2; num <= range; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
}
