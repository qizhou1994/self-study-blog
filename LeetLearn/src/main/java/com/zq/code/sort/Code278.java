package com.zq.code.sort;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/20
 */
public class Code278 {

    public int firstBadVersion(int n) {
        long l = 1 ;
        long r = n;
        long mid;
        while (l<=r){
            mid = l+(r)/2;
            if(isBadVersion((int)mid)){
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        return (int)l;
    }

}
