package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/4/2
 */
public class Code73 {

    public void setZeroes(int[][] matrix) {

        int [][] x = new int[matrix.length][matrix[0].length];
        for(int i = 0 ; i < matrix.length;i++){
            for(int j = 0 ; j < matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int t=0;t<matrix.length;t++){
                        x[t][i]=1;
                    }
                    for(int t=0;t<matrix[0].length;t++){
                        x[i][t]=1;
                    }
                }
            }
        }

        for(int i = 0 ; i < matrix.length;i++){
            for(int j = 0 ; j < matrix[0].length;j++){
                if(x[j][i]==1){
                    matrix[j][i] = 0;
                }
            }
        }

    }
}
