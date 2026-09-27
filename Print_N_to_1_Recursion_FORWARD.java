class SolutionR3 {
    // Recursive function to print numbers from current down to 1
    public void printNumbers(int current) {
        // Base case: if current is less than 1, stop recursion
        if (current < 1)
            return;

        // Print current number
        System.out.print(current + " ");

        // Recursive call with next smaller number
        printNumbers(current - 1);
    }
}

public class Print_N_to_1_Recursion_FORWARD {
    public static void main(String[] args) {
        SolutionR3 sol = new SolutionR3();
        int n = 10;

        sol.printNumbers(n);
        System.out.println();
    }
}