package com.zq.code.datastruct;

/**
 * @author zhouqi
 * @desc
 * @data 2021/8/2
 */
public class Code733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        deepfirstsearch(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    //image[r][c] == newV||image[r][c]!=old条件因素
    private void deepfirstsearch(int[][] image, int r, int c, int old, int newV) {
        if (r >= image.length || r < 0 || c < 0 || c >= image[0].length||image[r][c] == newV||image[r][c]!=old) {
            return;
        }
        int temp = image[r][c];
        if (image[r][c] == old) {
            image[r][c] = newV;
        }

        deepfirstsearch(image, r, c - 1, temp, newV);
        deepfirstsearch(image, r, c + 1, temp, newV);
        deepfirstsearch(image, r - 1, c, temp, newV);
        deepfirstsearch(image, r + 1, c, temp, newV);
    }
}
