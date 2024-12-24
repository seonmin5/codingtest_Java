import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    private static int findNthIndex(ArrayList<Integer> list, int target, int index) {
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                count++;
                if (count == index) {
                    return i+1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        
        ArrayList<Integer> numbers = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        System.out.print(findNthIndex(numbers, 2, 3));
    }
}