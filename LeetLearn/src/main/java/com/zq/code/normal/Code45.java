package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/6
 */
public class Code45 {

    public int jump(int[] nums) {
        int jup = 0;
        int max = 0;
        int endpoint=0;
        for(int i = 0 ; i < nums.length-1;i++){
            max = nums[i]+i>=max?nums[i]+i:max;
            if(endpoint == i){
                endpoint = max;
                jup++;
            }
        }

        return jup;
    }

    public static void main(String[] args) {
        Code45 l = new Code45();
        System.out.println("a = " + l.jump(new int[]{1,2, 1, 1, 1}));
    }
}
