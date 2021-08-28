class Solution {
    public double average(int[] salary) {
        // bubble sort
        boolean swapped;
        for(int i=0; i<salary.length; i++) {
            swapped = false;
            for(int j=1; j<salary.length-i; j++) {
                if(salary[j] < salary[j-1]) {
                    int temp = salary[j];
                    salary[j] = salary[j-1];
                    salary[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        int sum = 0;
        for(int i=1; i<salary.length-1; i++) {
            sum += salary[i];
        }
        double ans = sum/((salary.length-2)*1.0);
        return ans;
    }
}