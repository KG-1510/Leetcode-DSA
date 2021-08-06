class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                int n = Integer.parseInt((""+ch));
                if(!nums.contains(n)) {
                 nums.add(n);   
                }
            }
        }
        
        Collections.sort(nums);

        if(nums.size() > 1) {
            return nums.get(nums.size()-2);
        }
        else {
            return -1;
        }
    }
}