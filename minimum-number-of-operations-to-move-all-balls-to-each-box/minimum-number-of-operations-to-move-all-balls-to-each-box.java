class Solution {
    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];
        for(int i=0; i<boxes.length(); i++) {
            int moves = 0;
            for(int j=0; j<boxes.length(); j++) {
                if(j==i) {
                    continue;
                }
                else if(boxes.charAt(j) == '1'){
                    moves += Math.abs(i-j);
                }
            }
            answer[i] = moves;
        }
        return answer;
    }
}