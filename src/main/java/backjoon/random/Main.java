package backjoon.random;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> subjectPoints = new ArrayList<>();
        int subjectSize = sc.nextInt();
        for (int i = 0; i < subjectSize; i++) {
            subjectPoints.add(sc.nextInt());
        }
        double maxPoint = Collections.max(subjectPoints);
        double avg = 0;
        for (Integer subjectPoint: subjectPoints) {
            avg += subjectPoint / maxPoint * 100;
        }
        System.out.print(avg / subjectSize);
    }
}