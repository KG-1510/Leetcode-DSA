class Solution {
    public String convertToTitle(int columnNumber) {
            char arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    StringBuilder sb = new StringBuilder();
    while(columnNumber > 0) {
        if(columnNumber % 26 == 0) {
            sb.insert(0, "Z");
            columnNumber--;
        }
        else sb.insert(0, arr[columnNumber%26-1]);
        columnNumber /= 26;
      }
      return sb.toString();
    }
}