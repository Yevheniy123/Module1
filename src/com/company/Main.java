package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Дорогой пользователь введи число: ");
        int num = in.nextInt();
        System.out.println("Введенное число ("+ num+") делиться на такие числа:");
        for (int i = 1; i <= num; i++)
            if ((num % i)==0)
                System.out.println(i);
}
}
