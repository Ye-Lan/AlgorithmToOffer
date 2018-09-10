package com.yelan;


/*
* 请实现一个函数，用来判断一颗二叉树是不是对称的。
* 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
*
* 对称的二叉树：
*   1
   / \
  2   2
 / \ / \
3  4 4  3
*
* */

public class 对称的二叉树 {

    public static void main(String[] args){

    }

    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null) return true;
        return symmeterial(pRoot.left,pRoot.right);
    }

    boolean symmeterial(TreeNode leftNode,TreeNode rightNode){

        if(leftNode == null && rightNode == null) return true;
        if(leftNode != null && rightNode != null) return leftNode.val == rightNode.val && symmeterial(leftNode.left,rightNode.right) && symmeterial(leftNode.right,rightNode.left);
        return false;
    }

}
