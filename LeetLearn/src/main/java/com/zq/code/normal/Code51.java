package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/6
 */
public class Code51 {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if(x == 0 ){
            return 0;
        }

        double sum = 1;
        long b = n;
        if(b<0){
            b = -b;
            x = 1/x;
        }
         while (b>0){
             if((b&1)==1){
                 sum = sum*x;
             }
             x=x*x;
             b = b/2;
         }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Code51().myPow(2.100, -2));
    }
}
