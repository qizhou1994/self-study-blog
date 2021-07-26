package com.zq.code.datastruct;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code73 {
    public void setZeroes(int[][] matrix) {

        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                if (matrix[r][c] == 0) {
                    temp[r][c] = -1;
                }
            }
        }

        for(int r = 0 ; r < temp.length;r++) {
            for (int c = 0; c < temp.length; c++) {
                if (temp[r][c] == -1) {
                    for(int x = 0 ; x < matrix.length;x++){
                        matrix[x][c] = 0;
                    }
                    for(int x = 0 ; x < matrix[0].length;x++){
                        matrix[r][x] = 0;
                    }
                }
            }
        }

    }
}
