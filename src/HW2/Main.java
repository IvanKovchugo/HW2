package HW2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ok();
        oc();
        ko();
        so();
    }

    public static boolean ok() {
        int a = 15;
        int b = 6;
        int c = a + b;
        if (c > 10 && c < 20) {
            System.out.println("Значение в пределах от 10 до 20");
            return true;
        } else {
            System.out.println("Значение < 10 или > 20");
            return false;
        }

    }

    public static void oc() {
        int a = 5;
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean ko() {
        int a = -15;

        if (a >= 0) {
            System.out.println("Значение положительное");
            return true;
        } else {
            System.out.println("Значение отрицательное");
            return false;
        }

    }

    public static void so() {
        int a = 4;
        String word = "word";
        for (a = 0; a < 4; a++) {
            System.out.println(word + a);
        }

    }

//    public static void po() {                            Попытка сделать 5 задание
//       Scanner scanner = new Scanner(System.in);
//       while (scanner.hasNextInt()) {
//           int a = scanner.nextInt();
//           for (long x = 0; x <100; x++) {
//               System.out.print(a + " ");
//               a = a + 4;
//
//
//           }
//           System.out.println();
//       }
//
//
//
}

