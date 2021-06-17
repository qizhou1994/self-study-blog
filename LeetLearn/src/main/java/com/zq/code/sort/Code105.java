package com.zq.code.sort;

import com.zq.code.bean.TreeNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/17
 */
public class Code105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode tree = new TreeNode();
        for (int i = 0; i < inorder.length; i++) {
            for (int l = 0; l < inorder.length; l++) {
                if (inorder[i] == preorder[0]) {

                }
            }
        }
    }
}
