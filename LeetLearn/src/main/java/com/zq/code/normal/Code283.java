package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code283 {
    public void moveZeroes(int[] nums) {
        int temp = 0 ;
        int i = 0;
        while ( i < nums.length){
            if(nums[i]==0 && nums.length>temp){
                for(int t = i;t<nums.length-temp-1;t++){
                    nums[t] = nums[t+1];
                }
                if(nums.length-temp-1>=i) {
                    nums[nums.length - temp - 1] = 0;
                }
                temp++;
            }else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] x = new int[]{0};
//        int[] x = new int[]{0,1,0,3,12};
        new Code283().moveZeroes(x);
        for(int x1:x){
            System.out.print(","+x1);
        }
    }
}
