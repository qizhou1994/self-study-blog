package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/4
 */
public class Code354 {

    public int maxEnvelopes(int[][] envelopes) {
        int[] nums = new int[envelopes.length];
        int max = 0;
        for(int i =0 ; i < envelopes.length;i++){
            for(int j =0 ; j < envelopes.length;j++){
                if(envelopes[i][0]>envelopes[j][0]&&envelopes[i][1]>envelopes[j][1]){
                    nums[i]=nums[i]+1;
                }
            }
            if(max<nums[i]){
                max = nums[i];
            }
        }
        return max+1;
    }


    public static void main(String[] args) {
        Code354 code354 = new Code354();
        int[][] i = new int[][]{{5,4},{6,4},{6,7},{2,3}};
        System.out.println(" i = "+ code354.maxEnvelopes(i));;
    }
}
