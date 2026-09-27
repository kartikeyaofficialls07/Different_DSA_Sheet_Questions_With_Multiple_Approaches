class SolutionR4 {
    // Recursive function to print numbers from current down to 1 using backtracking
    public void printNumbers(int current) {
        // Base case: if current is less than 1, stop recursion
        if (current < 1)
            return;

        // Recursive call with previous number
        printNumbers(current - 1);

        // Print current number during backtracking
        System.out.print(current + " ");
    }
}

public class Print_N_to_1_Recursion_BACKTRACKING {
    public static void main(String[] args) {
        SolutionR4 sol = new SolutionR4();
        int n = 10;

        sol.printNumbers(n);
        System.out.println();
    }
}
