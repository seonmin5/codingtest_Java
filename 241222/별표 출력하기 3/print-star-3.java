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
            for (int i = 0; i < n; i++) {
                for (int empty = 0; empty < i * 2; empty++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < (2*n-1) - (2*i); star++) {
                    System.out.print("* ");
                }
            System.out.println();
            }
        }

        br.close();
    }
}