class Solutio {
    // Function to take a string and return a modified string
    public String modifyString(String s) {
        // Assign existing string to a new variable
        String newStr = s;
        // Append extra text
        newStr += " World";
        // Return the modified string
        return newStr;
    }
}

public class Passing_returning_assigning_strings {
    public static void main(String[] args) {
        // Original string
        String original = "Hello";

        // Create object of Solution class
        Solutio sol = new Solutio();

        // Pass string to function and store returned value
        String result = sol.modifyString(original);

        // Print results
        System.out.println("Original: " + original);
        System.out.println("Returned: " + result);
    }
}
