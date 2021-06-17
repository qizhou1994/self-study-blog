package com.zq.code.sort;

import com.zq.code.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/15
 */
public class Code101 {
    public boolean isSymmetric(TreeNode root) {
        if (root != null) {
            return check(root.left, root.right);
        }
        return true;

    }

    private boolean check(TreeNode treeNode, TreeNode treeNode2) {
        if (treeNode == null && treeNode2 == null) {
            return true;
        }
        if (treeNode != null && treeNode2 != null &&(treeNode.val == treeNode2.val)) {
            if (check(treeNode.left, treeNode2.right) && check(treeNode.right, treeNode2.left)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Code101().isSymmetric(new TreeNode(1,new TreeNode(2),new TreeNode(3)));
    }
}

/*    List<Integer> list = new ArrayList<>();
    List<TreeNode> listTemp = new ArrayList<>();
    TreeNode current = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3,new TreeNode(6),new TreeNode(7)));

        while (current!=null||listTemp.size()!=0){
                list.add(current.val);
                if(current.left!=null){
                if(current.right!=null){
                listTemp.add(current.right);
                }
                current = current.left;
                }else if(current.right!=null){
                current = current.right;
                }else if(listTemp.size()!=0){
                current = listTemp.get(listTemp.size()-1);
                listTemp.remove(listTemp.size()-1);
                }else {
                current = null;
                }
                }*/
