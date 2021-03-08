package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/6
 */
public class Code48 {


    public void rotate(int[][] matrix) {

        int n = matrix.length;
        int[][] a = new int[n][n];
        for(int i = 0 ;i < matrix.length;i++){
            for(int j = 0 ; j < matrix.length;j++){
                a[j][n-i-1]=matrix[i][j];
            }
        }


        for(int i = 0 ;i < matrix.length;i++){
            for(int j = 0 ; j < matrix.length;j++){
               matrix[i][j] = a[i][j];
            }
        }

    }


    public static void main(String[] args) {
        Code48 l = new Code48();
        l.rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
    }
}
