package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/15
 */
public class Code55 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0 ; i < nums.length;i++){
          max = Math.max(nums[i] + i, max);
            if(nums[i] == 0&& max<=i&&nums.length-1!=i){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(new Code55().canJump(new int[]{2,5,0,0}));
        System.out.println(new Code55().canJump(new int[]{0,1}));
        System.out.println(new Code55().canJump(new int[]{0}));
        System.out.println(new Code55().canJump(new int[]{1,0}));
        System.out.println(new Code55().canJump(new int[]{2,1,0,0}));
    }
}
