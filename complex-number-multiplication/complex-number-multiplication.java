class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int r1, r2, im1, im2;
        
        int split1 = num1.indexOf('+');
        int i1 = num1.indexOf('i');
        r1 = Integer.parseInt(num1.substring(0, split1));
        im1 = Integer.parseInt(num1.substring(split1 + 1, i1));
        
        int split2 = num2.indexOf('+');
        int i2 = num2.indexOf('i');
        r2 = Integer.parseInt(num2.substring(0, split2));
        im2 = Integer.parseInt(num2.substring(split2 + 1, i2));
        
        int realProd = r1 * r2;
        int imProd = (r1*im2) + (im1*r2);
        int onlyIm = im1*im2;
        // System.out.println(realProd-onlyIm + " " + imProd);
        String finalAns = realProd-onlyIm + "+" + imProd + "i";
        return finalAns;
    }
}