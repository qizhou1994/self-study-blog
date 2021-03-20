package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/20
 */
public class Code70 {

    public int climbStairs(int n) {
        int[]f = new int[n+1];
        f[0]=1;
        f[1]=1;
        int i = 2;
        while (i<=n){
            f[i]= f[i-1]+f[i-2];
            i++;
        }
       return f[i-1];
    }

    public static void main(String[] args) {
        System.out.println(new Code70().climbStairs(4));
        System.out.println(new Code70().climbStairs(2));
        System.out.println(new Code70().climbStairs(3));
        System.out.println(new Code70().climbStairs(5));
        System.out.println(new Code70().climbStairs(1));
    }
}
