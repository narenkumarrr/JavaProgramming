public class PrimeNum {
    public static void main(String args[]) {
        int num = 120;
        int count = 0;
        if (num <= 1)
            System.out.println(num + " is not  prime num.");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        if (count < 3)
            System.out.println(num + " is a prime number");
        else {
            System.out.println(num + " is  not a prime number");
        }
    }
}
