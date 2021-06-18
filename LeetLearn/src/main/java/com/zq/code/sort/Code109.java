package com.zq.code.sort;

import com.zq.code.bean.ListNode;
import com.zq.code.bean.TreeNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/18
 */
public class Code109 {


    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode f = head.next;
        ListNode l = head;
        TreeNode root = new TreeNode();
        boolean frist = true;
        while (l != null) {
            if (f != null) {
                TreeNode temp = root.left;
                root.left = new TreeNode(l.val);
                if (root.left != null) {
                    root.left.left = temp;
                }
                f = f.next;
            } else {
                if (frist) {
                    root.val = l.val;
                    frist = false;
                } else {
                    if(root.right==null){
                        root.right = new TreeNode(l.val);
                    }else {
                        TreeNode temp = root.right;
                        while (temp.right!=null){
                            if(temp.right ==null){
                                break;
                            }
                            temp = temp.right;
                        }
                        temp.right= new TreeNode(l.val);
                    }
                }
            }
            l = l.next;
            if (f != null) {
                f = f.next;
            }

        }
        return root;
    }
}
