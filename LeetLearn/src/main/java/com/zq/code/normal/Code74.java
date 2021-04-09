package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/4/8
 */
public class Code74 {
    public boolean searchMatrix(int[][] matrix, int target) {


        int left = 0;
        int right = matrix.length-1;
        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            System.out.println("l = "+ left+",r ="+ right+"m="+middle);
            if (matrix[middle][0] == target) {
                return true;
            } else if (matrix[middle][matrix[middle].length - 1] == target) {
                return true;
            } else if (matrix[middle][0] < target && matrix[middle][matrix[middle].length - 1] > target) {
                for (int i = 0; i < matrix[middle].length; i++) {
                    if (matrix[middle][i] == target) {
                        return true;
                    }
                }
                return false;
            } else if (matrix[middle][matrix[middle].length - 1] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        boolean b = new Code74().searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},13);
        boolean b1 = new Code74().searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},3);
        System.out.println("b-="+b);
        System.out.println("b1-="+b1);
    }
}
