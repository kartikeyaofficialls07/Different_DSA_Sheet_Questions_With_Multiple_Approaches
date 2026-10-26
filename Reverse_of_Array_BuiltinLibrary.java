import java.util.*;

class Solutionrr {
    // Function to reverse the array using Collections.reverse
    public void reverseArray(List<Integer> arr) {
        // Call Collections.reverse to reverse list in-place
        Collections.reverse(arr);
    }
}

// Driver code
public class Reverse_of_Array_BuiltinLibrary {
    public static void main(String[] args) {
        // Input array as List
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Create Solution object
        Solutionrr obj = new Solutionrr();

        // Call reverse method
        obj.reverseArray(arr);

        // Output the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}