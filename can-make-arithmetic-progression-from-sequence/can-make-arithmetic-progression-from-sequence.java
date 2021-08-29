class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // selection sort
        for(int i=0; i<arr.length; i++) {
            int last = arr.length - i - 1;
            int max = 0;
            for(int j=1; j<=last; j++) {
                if(arr[j] < arr[max]) {
                    max = j;
                }
            }
            
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
        
        int diff = 0;
        for(int k=1; k<arr.length; k++) {
            if(k==1) {
                diff = arr[k] - arr[k-1];
                continue;
            }
            else {
                int temp = arr[k] - arr[k-1];
                if(temp != diff) {
                    return false;
                }
            }
        }
        return true;
    }
}