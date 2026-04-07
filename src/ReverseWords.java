import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine().trim();
        
        String[] words = str.split("\\s+"); // handles multiple spaces
        
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) System.out.print(" ");
        }
    }
}
