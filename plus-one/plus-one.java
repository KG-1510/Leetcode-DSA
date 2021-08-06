class Solution {
    public int[] plusOne(int[] digits) {
        // int[] ans = new int[digits.length];
        // int temp = 0;
        // for(int i=0; i<digits.length; i++) {
        //     temp = temp*10 + digits[i];
        // }
        // temp++;
        // System.out.println(temp);
        // String tempStr = Integer.toString(temp);
        // for(int j=0; j<ans.length; j++) {
        //     char ch = tempStr.charAt(j);
        //     int num = Integer.parseInt(String.valueOf(ch));
        //     System.out.println(num);
        //     ans[j] = num;
        // }
        // return ans;
        int len = digits.length;
for(int i=len-1 ; i>=0 ; i--)
{
if(digits[i] == 9)
{digits[i] = 0;}
else
{digits[i] +=1;
return digits;}
}
int[] arr = new int[len + 1];
arr[0] = 1;
return arr;
    }
}