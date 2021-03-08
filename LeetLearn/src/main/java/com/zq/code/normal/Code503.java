package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/1
 */
public class Code503 {

    public int[] nextGreaterElements(int[] nums) {
        int numsa[]= new int[nums.length];
        for(int i = 0 ; i < nums.length;i++){
            numsa[i]=-1;
            int j = i;
            int temp = nums.length;
            while (temp-->0){

                if(nums[i]<nums[j]){
                    numsa[i] = nums[j];
                    temp = -1;
                    continue;
                }
                j++;
                if(j == nums.length){
                    j = 0;
                }
            }
        }
        return numsa;
    }

    public static void main(String[] args) {
        Code503 l = new Code503();
        for(int a : l.nextGreaterElements(new int[]{1,2,1})){
            System.out.println("a = "+a);
        }

    }
}
