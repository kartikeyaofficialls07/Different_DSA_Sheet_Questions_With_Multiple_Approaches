import java.util.*;

class Solutions {
    public void accessCharacters(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}

public class access_char_of_string {
    public static void main(String[] args) {
        Solutions obj = new Solutions();
        String s = "Hello";
        obj.accessCharacters(s);
    }
}