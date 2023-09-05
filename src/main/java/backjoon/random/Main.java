package backjoon.random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        int totalSW = 0;
        int totalEm = 0;
        int totalAI = 0;
        int no = 0;

        for (int i = 0; i < p; i++) {
            int g = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();

            if (g == 1) no++;
            else {
                if (c == 1 || c == 2) totalSW++;
                if (c == 3) totalEm++;
                if (c == 4) totalAI++;
            }
        }

        System.out.println(totalSW);
        System.out.println(totalEm);
        System.out.println(totalAI);
        System.out.println(no);

    }
}
