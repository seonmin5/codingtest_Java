import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int c = 65;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.printf("%c ", (char)c);
                c++;
                if (c == 91) c = 65;
            }
            System.out.println();
            for (int empty = 0; empty <= i; empty++) {
                System.out.print("  ");
            }
        }

        br.close();
    }
}