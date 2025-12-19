
public class binaryToDecimal {
    public static void binToDec(int bin) {
        int val = 0;
        int pow = 0;
        for (int temp = bin; temp != 0; temp = temp / 10) {
            int x = temp % 10;
            val = val + (x * (int) Math.pow(2, pow));
            pow++;
        }
        System.out.println(val);
    }

    public static void main(String args[]) {
        binToDec(1010);
    }
}