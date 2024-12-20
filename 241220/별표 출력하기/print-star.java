import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        if (n == 1) {
            System.out.print("*");
        } else {
            for (int i = n; i > 0; i--) {
               System.out.print("* ");
                for (int j = 0; j < n-i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 1; i < n; i++) {
               System.out.print("* ");
                for (int j = 1; j < n-i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        br.close();
    }
}