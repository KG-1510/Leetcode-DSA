class Solution {
    public double findArea(int a, int b, int c) {
        double sp = (a+b+c)/2.0;
        double temp = sp*(sp-a)*(sp-b)*(sp-c);
        double triArea = Math.sqrt(temp);
        return triArea;
    }
    
    int maxPerimeter = 0;
    public int largestPerimeter(int[] nums) {
        // selection sort
        for(int i=0; i<nums.length; i++) {
            int last = nums.length - i - 1;
            int max = 0;
            for(int j=0; j<=last; j++) {
                if(nums[j] > nums[max]) {
                    max = j;
                }
            }
            int temp = nums[max];
            nums[max] = nums[last];
            nums[last] = temp;
        }
        
        for(int i=2; i<nums.length; i++) {
            double area = findArea(nums[i-2], nums[i-1], nums[i]);
            if(area > 0) {
                if(nums[i-2]+nums[i-1]+nums[i] > maxPerimeter) {
                    maxPerimeter = nums[i-2]+nums[i-1]+nums[i];
                }
            }
        }
        return maxPerimeter;
    }
}