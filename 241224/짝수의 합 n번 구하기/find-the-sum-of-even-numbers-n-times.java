import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int result(int a, int b) {
        int start = a;
        int end = b;
        int sum = 0;

        if (a % 2 != 0) {
            start = a+1;
        }
        if (b % 2 != 0) {
            end = b-1;
        }

        for (int i = start; i <= end; i+=2) {
            sum += i;
        }
        
        return sum;
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(result(a, b));
        }

        br.close();
    }
}