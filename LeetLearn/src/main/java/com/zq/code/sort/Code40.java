package com.zq.code.sort;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/8
 */
public class Code40 {

    public int[] getLeastNumbers(int[] arr, int k) {

        if (k == 0) {
            return new int[0];
        }
        int[] x = new int[k];
        for (int i = 0; i < k; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            x[i] = arr[i];
        }
        return x;
    }

    public void moveZeroes(int[] nums) {

        int index=0;
        for (int i = 0; i < nums.length-index; ) {
            int t = nums[i];
            if (nums[i] != 0) {
                i++;
                continue;
            }

            for (int j = i; j < nums.length - index-1; j++) {
                nums[j] = nums[j + 1];
            }

            if(nums.length - index-1>0){
                nums[nums.length - index-1] = t;
            }else {
                break;
            }

            index++;
        }
    }

    public static void main(String[] args) {
        int[] i = new Code40().getLeastNumbers(new int[]{3, 2, 1}, 3);
//        int[] xx = new int[]{3, 2, 10, 0, 0};
        int[] xx = new int[]{0,1,0,3,12};
        new Code40().moveZeroes(xx);
        for (int x : xx) {
            System.out.print(",x  = " + x);
        }

    }
}
