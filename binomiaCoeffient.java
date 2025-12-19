public class binomiaCoeffient {
    public static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n - r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String args[]) {
        System.out.println(binCoeff(5, 2));

    }
}
