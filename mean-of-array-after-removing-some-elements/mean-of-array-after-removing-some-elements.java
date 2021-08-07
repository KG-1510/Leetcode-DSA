class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int perc = arr.length / 20;
        int sum = 0;
        int count = 0;
        System.out.println(perc);
        for(int i=perc; i<arr.length-perc; i++) {
            sum += arr[i];
            count++;
        }
        
        return sum / (double)(arr.length - 2*perc);
    }
}