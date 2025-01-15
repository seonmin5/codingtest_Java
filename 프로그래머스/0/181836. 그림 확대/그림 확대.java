class Solution {
    public String[] solution(String[] picture, int k) {
        return multiplePicture(picture, k);
    }
    
    private static String[] multiplePicture(String[] picture, int k) {
        String[] result = new String[picture.length * k];
        int index = 0;
        for (String row : picture) {
            StringBuilder add = new StringBuilder();
            for (char c : row.toCharArray()) {
                add.append(String.valueOf(c).repeat(k));
            }
            for (int i = 0; i < k; i++) {
                result[index++] = add.toString();
            }
        }
        return result;
    }
}