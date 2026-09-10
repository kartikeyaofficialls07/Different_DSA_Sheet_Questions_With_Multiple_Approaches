class SolutionR1 {
    // Recursive function to print name count times
    public void printName(String name, int count, int N) {
        // Base case: if count equals N, stop recursion
        if (count == N)
            return;

        // Print the name
        System.out.println(name);

        // Recursive call with incremented count
        printName(name, count + 1, N);
    }
}

public class Name_N_Times_Recursion {
    public static void main(String[] args) {
        SolutionR1 sol = new SolutionR1();
        int N = 5;
        String name = "Ashish";

        sol.printName(name, 0, N);
    }
}