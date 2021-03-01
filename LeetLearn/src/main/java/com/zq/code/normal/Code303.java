package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/1
 */
public class Code303 {

    public class NumArray {

        private int[] nums;
        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int i, int j) {
            int sum = 0;
            while (i<=j){
                sum+=nums[i++];
            }
            return sum;
        }
    }
}
