import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        while (n != 25) {
            if (n < 25) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }
            n = Integer.parseInt(br.readLine().trim());
        }
        System.out.println("Good");

        br.close();
    }
}