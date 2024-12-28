import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
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

    private static int maxResult(int arr[]) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }
        int max = arr[0];
        boolean found = false;
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1) {
                max = Math.max(max, num);
                found = true;
            }
        }
        return found ? max : -1;
    }
}