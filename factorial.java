public class factorial {
    public static void fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        System.out.println(res);
    }

    public static void main(String args[]) {
        int n = 4;
        fact(n);
    }
}
