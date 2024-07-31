import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of friends
        int n = scanner.nextInt();
        
        // Initialize the array to store who gave the gift to whom
        int[] p = new int[n];
        
        // Read the array p
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        
        // Initialize the result array
        int[] result = new int[n];
        
        // Populate the result array
        for (int i = 0; i < n; i++) {
            result[p[i] - 1] = i + 1;
        }
        
        // Print the result array
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
