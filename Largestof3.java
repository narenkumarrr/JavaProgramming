public class Largestof3 {

    public static void main(String args[]) {
        int a = 1;
        int b = 31;
        int c = 4;

        if ((a > b) && (a > c)) {
            System.out.println("A is largest");
        }
        if ((b > a) && (b > c)) {
            System.out.println("B is largest");
        }
        if ((c > b) && (c > a)) {
            System.out.println("C is largest");
        }
    }
}
