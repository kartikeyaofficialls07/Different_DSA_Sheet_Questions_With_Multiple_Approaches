import java.util.*;

class Solutionr4 {
    // Function to find sum of first N natural numbers using formula
    public int sumOfNaturalNumbers(int N) {
        // Apply formula directly
        return (N * (N + 1)) / 2;
    }
}

public class Sumof_N_NaturalNo_Formula {
    public static void main(String[] args) {
        Solutionr4 obj = new Solutionr4();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(obj.sumOfNaturalNumbers(N));
        sc.close();
    }
}