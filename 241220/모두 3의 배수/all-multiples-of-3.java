import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder input = new StringBuilder();
        String line;
        
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            input.append(line).append(" ");
        }
        
        StringTokenizer st = new StringTokenizer(input.toString());
        int count = 0;

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (n % 3 == 0) {
                count++;
            }
        }

        System.out.print(count == 5 ? 1 : 0);
        br.close();
    }
}