import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int max = -1;
        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            int n = Integer.parseInt(st.nextToken());
            if (max < n) max = n;
            if (min > n) min = n;
        }

        System.out.println(max * min);
    }
}