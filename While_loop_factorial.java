public class While_loop_factorial {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;

        while (n > 0) {
            factorial *= n; // Keep finding factorial with n and decrement n
            n--;
        }

        System.out.println("Factorial of 5 is: " + factorial); // Print the factorial
    }
}
