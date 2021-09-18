class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i=0; i<words.length; i++) {
            String word1 = words[i];
            for(int j=0; j<words.length; j++) {
                String word2 = words[j];
                if(checkDiff(word1, word2)) {
                    if(word1.length() * word2.length() > max) {
                        max = word1.length() * word2.length();
                    }
                }
            }
        }
        return max;
    }
    
public boolean checkDiff(String a, String b) {
	int[] aCount = new int[26], bCount = new int[26];
	
	for(char ch: a.toCharArray())
		aCount[ch-'a']++;
	
	for(char ch: b.toCharArray())
		bCount[ch-'a']++;

	for(int i=0; i<26; i++) {
		if(aCount[i]*bCount[i] != 0) // this character exists in both strings
			return false;
	}

	return true;
}
}