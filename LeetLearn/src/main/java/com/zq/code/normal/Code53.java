package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/10
 */
public class Code53 {

/*    public int maxSubArray(int[] nums) {

        int max = 0;

        int tl;
        int tr;
        int temp=0;
        int currentSum = 0;
        for(int i = 0 ; i< nums.length;i++){

            if(currentSum>0){
                currentSum = currentSum+nums[i];
            }else if(nums[i]>=0){
                currentSum= nums[i];
            }else {
            }



        }
        return max;
    }*/
    public int maxSubArray(int[] nums) {

        int max = 0;
        int pre = 0;

        for(int i = 0 ; i< nums.length;i++){
            if(i==0){
                max = nums[i];
            }
            //pre 为负数
            pre = Math.max(pre+nums[i],nums[i]);
            max = Math.max(max,pre);
        }
        return max;
    }




    public static void main(String[] args) {

    }
}
