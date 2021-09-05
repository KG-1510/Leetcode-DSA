class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getNum(firstWord) + getNum(secondWord) == getNum(targetWord);
    }
    
    private int getNum(String s) {
        return Integer.valueOf(s.chars().mapToObj(e -> String.valueOf(e - 'a'))
            .collect(Collectors.joining()));
    }
}