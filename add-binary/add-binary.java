class Solution {
    public String addBinary(String a, String b) {
       char[] digit1 = a.toCharArray();
        char[] digit2 = b.toCharArray();

        int n = digit1.length - 1;
        int m = digit2.length - 1;

        // re-used for running sum and carry over.
        int x = 0;
        StringBuilder sb = new StringBuilder();
        while (n >= 0 || m >= 0 || x > 0) {
            x += n >= 0 ? digit1[n--] - '0' : 0;
            x += m >= 0 ? digit2[m--] - '0' : 0;

            // sum - insert in the beginning of StringBuilder as char.
            sb.insert(0, (char) ((x % 2) + '0'));
            // carryOver
            x /= 2;
        }

        return sb.toString();
    }
}