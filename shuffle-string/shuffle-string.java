class Solution {
    public String restoreString(String s, int[] indices) {
char[] sol = new char[s.length()];
int index=0;

    for(int i:indices)
        sol[i] = s.charAt(index++);
    return new String(sol);

    }
}