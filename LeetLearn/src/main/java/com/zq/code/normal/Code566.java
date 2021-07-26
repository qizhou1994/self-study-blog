package com.zq.code.normal;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code566 {
/*    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] x = new int[r][c];
        int newR = 0 , newC = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int cj = 0; cj < mat[0].length; cj++) {
                if(newC>=c){
                    newR++;
                    if(newR >=r){
                        System.out.print("newR >=r)");
                        return mat;
                    }
                    newC = 0;
                }
                if(newR >=r){
                    System.out.print("newR >=r)");
                    return mat;
                }
                x[newR][newC++] = mat[i][cj];

            }
        }

        if(newR !=r-1){
            return mat;
        }
        return x;
    }*/

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] x = new int[r][c];
        int newR = mat.length , newC = mat[0].length;
        if(newC*newR!= r*c){
            return mat;
        }
        for (int i = 0; i < r*c; i++) {
            x[i/c][i%c] = mat[i/newC][i%newC];
        }
        return x;
    }
    public static void main(String[] args) {
        int[][] x = new int[][]{{1,2},{3,4}};

        int[][] temp = new Code566().matrixReshape(x,1,4);
        for (int i = 0; i < temp.length; i++) {
            for (int cj = 0; cj < temp[0].length; cj++) {
                System.out.print(","+temp[i][cj]);
            }
            System.out.println();
            }
    }
}
