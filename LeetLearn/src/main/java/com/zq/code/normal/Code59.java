package com.zq.code.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/17
 */
public class Code59 {

    public int[][] generateMatrix(int n) {

        int[][] x = new int[n][n];

        find( n, n, 0, 0, x,1);
        return x;
    }

    private void find(int r, int c, int x, int y, int[][] b,int v) {
        System.out.println("x=" + x + ",y=" + y+",v=" + b[x][y] );
        if (b[x][y]>0) {
            System.out.println("1x=" + x + ",y=" + y);
            return;
        }
        b[x][y] = v++;

        if ((y + 1 < c)&&b[x][y+1]==0 && ((x - 1 < 0) || b[x - 1][y] > 0)) {
            find(r, c, x, y + 1, b,v);
        } else if ((x + 1 < r)&&b[x+1][y]==0 && ((y + 1 >= c || b[x][y + 1] > 0))) {
            find(r, c, x + 1, y, b,v);
        } else if ((y - 1 >= 0) &&b[x][y-1]==0&& ((x + 1 >= r || b[x + 1][y] > 0))) {
            find(r, c, x, y - 1, b,v);
        } else if ((x - 1 >= 0) &&b[x-1][y]==0&& ((y - 1 < 0 || b[x][y - 1] > 0))) {
            find(r, c, x - 1, y, b,v);
        } else {
        }
    }

    public static void main(String[] args) {
        for(int[] x :new Code59().generateMatrix(4)){
            for(int x1:x){
                System.out.print(","+x1);
            }
            System.out.println();
        }
    }
}
