class SolutionR2 {
    // Recursive function to print numbers from current to n
    public void printNumbers(int current, int n) {
        // Base case: if current exceeds n, stop recursion
        if (current > n)
            return;

        // Print current number
        System.out.print(current + " ");

        // Recursive call with next number
        printNumbers(current + 1, n);
    }
}

public class Print_1_to_N_Recursion_FORWARD {
    public static void main(String[] args) {
        SolutionR2 sol = new SolutionR2();
        int n = 10;

        sol.printNumbers(1, n);
        System.out.println();
    }
}