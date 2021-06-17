package com.zq.code.sort;

import com.zq.code.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/16
 */
public class Code104 {

 /*   public int maxDepth(TreeNode root) {

       if(root == null){
           return 0;
       }
       int l = maxDepth(root.left);
       int r = maxDepth(root.right);
        return Math.max(l,r)+1;
    }*/

    public int maxDepth(TreeNode root) {
        return 0;
    /*    if(root == null){
            return 0;
        }


        List<List<Integer>> lists = new ArrayList<>();
        List<TreeNode> listTemp = new ArrayList<>();
        if (root != null) {
            listTemp.add(root);
        }
        int iT = 0;
        while (listTemp.size() != 0) {
            List<Integer> l = new LinkedList<>();
            List<TreeNode> listTemp1 = new ArrayList<>();

            for (int i =0; i <listTemp.size() ; i ++) {
                TreeNode treeNode = listTemp.get(i);
                    l.add(0,treeNode.val);

                if (treeNode.left != null) {
                    listTemp1.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    listTemp1.add(treeNode.right);
                }
            }
            iT++;
            System.out.println();
            listTemp.clear();
            listTemp.addAll(listTemp1);
            lists.add(l);
        }*/
    }
}
