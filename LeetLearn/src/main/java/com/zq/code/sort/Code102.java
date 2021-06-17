package com.zq.code.sort;

import com.zq.code.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/15
 */
public class Code102 {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> lists = new ArrayList<>();
        List<TreeNode> listTemp = new ArrayList<>();
        if (root != null) {
            listTemp.add(root);
        }
        int iT = 0;
        while (listTemp.size() != 0) {
            List<Integer> l = new LinkedList<>();
            List<TreeNode> listTemp1 = new ArrayList<>();

            System.out.println("iT="+ iT);
            for (int i =0; i <listTemp.size() ; i ++) {
                TreeNode treeNode = listTemp.get(i);
                System.out.print(","+ treeNode.val);
                if(iT%2 == 1){
                    l.add(0,treeNode.val);
                }else {
                    l.add(treeNode.val);
                }
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
        }
        return lists;
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1,new TreeNode(2,new TreeNode(4),null),new TreeNode(3,null,new TreeNode(5)));
        zigzagLevelOrder(treeNode);
    }


}
