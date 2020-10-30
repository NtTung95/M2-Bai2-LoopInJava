import java.util.Scanner;

public class SoHoanHao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        boolean check;
//        for (int i = 1; i <= number/2; i++) {
//            if (number%i==0){
//                sum += i;
//            }
//        }
        int i = 1;
        while (i<=number/2){
            if (number%i==0)
                sum +=i;
            i++;
        }
        check = sum == number;
        System.out.println(check);
    }
}
