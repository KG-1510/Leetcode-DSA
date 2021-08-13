class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        // if(num[0] == 0) {
        //     ArrayList<Integer> ans = new ArrayList<>();
        //     int sum = num[0] + k;
        //     int count = (int)(Math.log10(sum)+1);
        //     String nFinal = sum + "";
        //     for(int i=0; i<count; i++) {
        //         int digit = Integer.parseInt(nFinal.charAt(i) + "");
        //         ans.add(digit);
        //     }
        //     return ans;
        // }
        // ArrayList<Integer> ans = new ArrayList<>();
        // String n = "";
        // for(int i: num) {
        //     n+= i;
        // }
        // long numInt = Long.parseLong(n);
        // numInt = numInt + k;
        // String nFinal = numInt + "";
        // long count = (long)(Math.log10(numInt)+1);
        // for(int i=0; i<count; i++) {
        //     int digit = Integer.parseInt(nFinal.charAt(i) + "");
        //     ans.add(digit);
        // }
        // return ans;
           int i ;
        List<Integer> list = new ArrayList<>() ;
        for( i = num.length - 1 ; i >= 0 ; i-- )
        {
            list.add( ( num[i] + k ) % 10 ) ;
            k = ( num[i] + k ) / 10 ;
        }
        while( k > 0 )
        {
            list.add( k % 10 ) ;
            k = k / 10 ;
        }
        Collections.reverse(list) ;
        return list ;
    }
}