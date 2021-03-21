package com.zq.code.tencent;

public class Code69 {

    public int mySqrt(int x) {
        long l = 0;
        long r = x;
        long i = x/2;
        while (l<r){
            if(i*i>x){
                if(l!=0){
                    break;
                }
                r=i;
                i = i/2;
            }else if(i*i<x){
                l = i;
                i = i+1;
            }else {
                return (int) i;
            }
        }
        return (int) l;
    }

    public static void main(String[] args) {
        System.out.println(new Code69().mySqrt(8));
        System.out.println(new Code69().mySqrt(2));
        System.out.println(new Code69().mySqrt(4));
        System.out.println(new Code69().mySqrt(9));
        System.out.println(new Code69().mySqrt(6));
        System.out.println(new Code69().mySqrt(2147395599));
        System.out.println(new Code69().mySqrt(121));
    }

}
