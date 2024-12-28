import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int maxResult(int arr[]) {
        int max = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max == arr[i]) {
                max = -1;
                count++;
            } else if (arr[i] > max && count == 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(maxResult(arr));
        br.close();
    }
}