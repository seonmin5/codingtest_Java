import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int max1(int[] arr) {
        int max1 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max1 = arr[i];
            }
        }
        return max1;
    }

    private static int max2(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] == max1) {
                max2 = max1;
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.printf("%d %d", max1(arr), max2(arr));
        br.close();
    }
}