public class Tabulation {
    public static long fibTab(int n) {
        if (n <= 1) return n;
        long[] table = new long[n + 1];
        table[0] = 0;
        table[1] = 1;
        for (int i = 2; i <= n; i++) {
            table[i] = table[i-1] + table[i-2];
        }
        return table[n];
    }
    public static void main(String[] args) {
        System.out.println("Fib 10 using Tabulation: " + fibTab(10));
    }
}
