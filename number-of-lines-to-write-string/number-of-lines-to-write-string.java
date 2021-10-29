class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int totalLines = 1;
        int lastLine = 0;
        int sumBucket = 0;
        int width;
        
        for(int i=0; i<s.length(); i++) {
            width = (int)(s.charAt(i));
            sumBucket += widths[width-97];
            if(sumBucket > 100) {
                width = (int)(s.charAt(i));
                sumBucket = widths[width-97];
                totalLines++; // to add the total line value 
            }
            System.out.println(s.charAt(i) + " " + sumBucket + " " + totalLines);
        }
        
        int[] finalAns = new int[2];
        finalAns[0] = totalLines;
        finalAns[1] = sumBucket;
        return finalAns;
    }
}