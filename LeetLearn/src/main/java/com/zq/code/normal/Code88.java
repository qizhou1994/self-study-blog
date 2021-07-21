package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/21
 */
public class Code88 {

    public static void main(String[] args) {
//        new Code88().merge(new int[]{1,2,3,0,0,0},3,new int[]{1,2,3},3);
        new Code88().merge(new int[]{1},1,new int[]{0},0);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, i2 = 0;
        while ( i < m+i2 && i2 < n) {
            if (nums1[i] > nums2[i2]) {
                for(int t = nums1.length-1 ; t >i;t--){
                    nums1[t] = nums1[t-1];
                }
                nums1[i] = nums2[i2];
                i2++;
            }
            i++;
        }

        while (i2 < n){
            nums1[i++] = nums2[i2++];
        }
        while (i < m && i2 < nums2.length-1){
            nums1[i++] = nums2[i2++];
        }
        for(int x : nums1){
            System.out.println("x = "+ x);
        }
    }

}
