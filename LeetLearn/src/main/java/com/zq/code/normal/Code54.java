package com.zq.code.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/13
 */
public class Code54 {

    public List<Integer> spiralOrder(int[][] matrix) {

        int r = matrix.length;
        int c = 0;

        if (matrix != null && matrix.length != 0) {
            c = matrix[0].length;
        }
        int[][] b = new int[r][c];
        List<Integer> l = new ArrayList<>();
        find(l, r, c, 0, 0, b, matrix);
        return l;
    }

    private void find(List<Integer> l, int r, int c, int x, int y, int[][] b, int[][] matrix) {
        if (b[x][y]==1) {
            System.out.println("x=" + x + ",y=" + y);
            return;
        }
        l.add(matrix[x][y]);
        b[x][y] = 1;

        if ((y + 1 < c)&&b[x][y+1]==0 && ((x - 1 < 0) || b[x - 1][y] == 1)) {
            System.out.println("1x=" + x + ",y=" + y);
            find(l, r, c, x, y + 1, b, matrix);
        } else if ((x + 1 < r)&&b[x+1][y]==0 && ((y + 1 >= c || b[x][y + 1] == 1))) {
            System.out.println("2x=" + x + ",y=" + y);
            find(l, r, c, x + 1, y, b, matrix);
        } else if ((y - 1 >= 0) &&b[x][y-1]==0&& ((x + 1 >= r || b[x + 1][y] == 1))) {
            System.out.println("3x=" + x + ",y=" + y);
            find(l, r, c, x, y - 1, b, matrix);
        } else if ((x - 1 >= 0) &&b[x-1][y]==0&& ((y - 1 < 0 || b[x][y - 1] == 1))) {
            System.out.println("4x=" + x + ",y=" + y);
            find(l, r, c, x - 1, y, b, matrix);
        } else {
            System.out.println("x=" + x + ",y=" + y);
        }
    }


    public static void main(String[] args) {
        Code54 code54 = new Code54();
//        List<Integer> l = code54.spiralOrder(new int[][]{{1, 2, 3,4}, { 5, 6,7,8}, { 9,10,11,12}});
        List<Integer> l = code54.spiralOrder(new int[][]{{1, 2, 3,4}, { 5, 6,7,8}});
        for (int i : l) {
            System.out.println("," + i);
        }
    }
}
