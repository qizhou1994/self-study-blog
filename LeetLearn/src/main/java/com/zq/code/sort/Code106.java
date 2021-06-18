package com.zq.code.sort;

import com.zq.code.bean.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/18
 */
public class Code106 {

    public static void main(String[] args) {
        Code102.zigzagLevelOrder(new Code106().buildTree(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3}));
    }
    private Map<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        for(int i = 0 ; i < inorder.length;i++){
            map.put(inorder[i],i);
        }

        return buildTree(inorder,postorder,0,inorder.length-1,0,inorder.length-1);
    }


    private TreeNode buildTree(int[] inorder, int[] postorder, int il, int ir, int pl, int pr) {

        if(pl>pr||il>ir){
            return null;
        }

        TreeNode root = new TreeNode(postorder[pr]);
        int rootindex = map.get(root.val);
        int rnum = ir - rootindex;
        root.left = buildTree(inorder,postorder,il,rootindex-1,pl,pr-rnum-1);
        root.right = buildTree(inorder,postorder,rootindex+1,ir,pl-rnum,pr-1);

        return root;
    }


}
