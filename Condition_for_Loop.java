public class Condition_for_Loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                // Code for even numbers
            } else {
                System.out.println("Not Divisible");
                // Code for odd numbers
            }
        }
    }
}
