package BaiTap;

public class SoNT20 {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int n = 2;
        while (count < number) {
            if (isPrimeNumber(n)) {
                System.out.println(n);
                count++;
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
