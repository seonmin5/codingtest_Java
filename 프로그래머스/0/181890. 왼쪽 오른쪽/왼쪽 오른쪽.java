import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        return filteredList(str_list);
    }
    
    private static String[] filteredList(String[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("l")) {
                return Arrays.copyOfRange(list, 0, i);
            } else if (list[i].equals("r")) {
                return Arrays.copyOfRange(list, i+1, list.length);
            }
        }
        return new String[0];
    }
}