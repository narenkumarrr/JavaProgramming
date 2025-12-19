public class decimalToBinary {
    public static void decToBin(int dec) {
        int val = 0;
        int pow = 0;
        for (int temp = dec; temp > 0; temp = temp / 2) {
            int x = temp % 2;
            val = val + (x * (int) Math.pow(10, pow));
            pow++;
        }
        System.out.println(val);
    }

    public static void main(String args[]) {
        decToBin(100);
    }
}
