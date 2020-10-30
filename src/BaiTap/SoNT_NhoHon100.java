package BaiTap;

public class SoNT_NhoHon100 {
    public static void main(String[] args) {
        int n = 2;
        while (n < 100) {
            if (isPrimeNumber(n)) {
                System.out.println(n);
            }
            n++;
        }
    }
    public static boolean isPrimeNumber (int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}


