package com.zq.code.sort;

import com.zq.code.bean.TreeNode;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/18
 */
public class Code108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = buildTree(nums,0,nums.length-1);
        return root;
    }

    private TreeNode buildTree(int[] nums, int l, int r) {
        if(nums == null || l>r){
            return null;
        }
        int mid = l+(r-l)/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = buildTree(nums,l,mid-1);
        treeNode.right = buildTree(nums,mid+1,r);
        return treeNode;
    }

}
