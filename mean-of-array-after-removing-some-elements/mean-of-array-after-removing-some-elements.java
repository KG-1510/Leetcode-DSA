class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int perc = arr.length / 20;
        double avg = 0;
        int sum = 0;
        int count = 0;
        System.out.println(perc);
        for(int i=perc; i<arr.length-perc; i++) {
            sum += arr[i];
            count++;
        }
        
        avg = sum / (double)(arr.length - 2*perc);
        
        return avg;
//         Arrays.sort(arr);
//         int removeCount = arr.length / 20;
        
//         int sum = 0;
//         for (int i = removeCount; i < arr.length - removeCount; i++) {
//             sum += arr[i];
//         }
//         return sum / (double) (arr.length - 2 * removeCount);
    }
}