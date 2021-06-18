package com.zq.code.sort;

import com.zq.code.bean.TreeNode;

import java.util.HashMap;

/**
 * @author zhouqi
 * @desc
 * @data 2021/6/17
 */
public class Code105 {

    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0 ; i < inorder.length;i++){
            map.put(inorder[i],i);
        }

        return buildTree(preorder,inorder,0,preorder.length-1,0,preorder.length-1);

    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int pl, int pr, int il, int ir) {
        if(pl > pr){
            return null;
        }
        //当前节点 前序遍历中的第一个
        TreeNode treeNode = new TreeNode(preorder[pl]);
        //前序遍历的第一个作为根
        int indexroot = map.get(treeNode.val);
        //il中遍历的根节点位置 减去做左 就获取到左树
        int lnum = indexroot - il;
        //pl+1新的左 pl+lnum新的右节点 il根  中序遍历的左 indexroot减1 就是右范围
        treeNode.left = buildTree(preorder,inorder,pl+1,pl+lnum,il,indexroot-1);
        //pl+lum+1 是前序遍历的右 起始 lp+lum是左的最后一个  pr不变  indexroot是中序遍历加一作为新的根  ir是右结束
        treeNode.right = buildTree(preorder,inorder,pl+lnum+1,pr,indexroot+1,ir);
        return treeNode;
    }
}
