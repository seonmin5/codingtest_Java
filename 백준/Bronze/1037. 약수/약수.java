import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int MAX = -1;
        int MIN = -1;
        if (N == 1) {
            MAX = arr[0];
            System.out.println(MAX*MAX);
        } else {
            MAX = Arrays.stream(arr).max().getAsInt();
            MIN = Arrays.stream(arr).min().getAsInt();
            System.out.println(MAX*MIN);
        }

    }
}