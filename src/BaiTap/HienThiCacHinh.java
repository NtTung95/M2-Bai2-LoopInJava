package BaiTap;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle bot");
        System.out.println("2. Draw the triangle top");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                for(int i = 1; i<=5; i++)
                    for(int j = 1; j < i; j++)
                        System.out.print("*");
                System.out.println();
                break;
            case 2:
                for (int i = 1; i <= 5; i++)
                    for (int j = 5; j >= i; j--)
                        System.out.println("*");
                break;
            case 3:
                for (int i = 1; i <= 3; i++)
                    for (int j = 1; j < 8; j++)
                        System.out.println("*");
                break;
            case 0:
                System.exit(0);
        }
        while (choice != 0) {
        }
    }
}
