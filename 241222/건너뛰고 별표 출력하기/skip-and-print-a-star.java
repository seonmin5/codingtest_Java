import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        
        if (n  == 1) {
            System.out.print("*");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.printf("\n\n");
            }
            for (int i = 0; i < n; i++) {
                for (int j = n-1; j > i; j--) {
                    System.out.print("*");
                }
                System.out.printf("\n\n");
            }
        }
        
        br.close();
    }
}