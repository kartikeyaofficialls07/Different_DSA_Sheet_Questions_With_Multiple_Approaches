import java.util.*;

class SolutionS {
    // Function to find sum of first N natural numbers using loop
    public int sumOfNaturalNumbers(int N) {
        // Initialize sum to 0
        int sum = 0;

        // Loop from 1 to N
        for (int i = 1; i <= N; i++) {
            // Add current number to sum
            sum += i;
        }

        // Return the computed sum
        return sum;
    }
}

public class Sumof_N_NaturalNo_Bruteforce {
    public static void main(String[] args) {
        // Create object of Solution class
        SolutionS obj = new SolutionS();

        // Input value for N
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Call the function and store the result
        int result = obj.sumOfNaturalNumbers(N);

        // Print the result
        System.out.println(result);
    }
}