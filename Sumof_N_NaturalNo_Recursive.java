class SolutionR44 {
    // Recursive function to find sum of first N natural numbers
    public int sumOfNaturalNumbers(int N) {
        // Base case: if N is 1, return 1
        if (N == 1) {
            return 1;
        }
        // Recursive case: current number + sum of previous numbers
        return N + sumOfNaturalNumbers(N - 1);
    }
}

public class Sumof_N_NaturalNo_Recursive {
    public static void main(String[] args) {
        SolutionR44 obj = new SolutionR44();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(obj.sumOfNaturalNumbers(N));
        sc.close();
    }
}