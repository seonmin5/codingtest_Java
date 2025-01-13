class Solution {
    public int solution(int[] arr) {
        return arrayCount(arr);
    }
    
    private static int arrayCount(int[] arr) {
        int count = 0;
        while (true) {
            int[] newArray = new int[arr.length];
            boolean isSame = true;
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    newArray[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    newArray[i] = arr[i] * 2 + 1;
                } else {
                    newArray[i] = arr[i];
                }
                
                if (newArray[i] != arr[i]) {
                    isSame = false;
                }
            }
            
            if (isSame) {
                break;
            }
            
            arr = newArray;
            count++;
            
        }
        
        return count;
    }
}