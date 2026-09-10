class Solutionr2 {
    // Recursive function to print numbers from current to n using backtracking
    public void printNumbers(int current, int n) {
        // Base case: if current exceeds n, stop recursion
        if (current > n)
            return;

        // Recursive call with next number
        printNumbers(current + 1, n);

        // Print current number during backtracking
        System.out.print(current + " ");
    }
}

public class Print_1_to_N_Recursion_BACKTRACKING {
    public static void main(String[] args) {
        Solutionr2 sol = new Solutionr2();
        int n = 10;

        sol.printNumbers(1, n);
        System.out.println();
    }
}