package exercise.com.Count_SubArrays_With_Negative_Sums;

import java.util.Scanner;

public class ArrayExercise1_Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = scanner.nextInt();
        }
        System.out.println(ArrayExercise1.countSubarraysWithNegativeSum(A));

    }
}
