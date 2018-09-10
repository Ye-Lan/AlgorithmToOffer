package com.yelan;

import com.sun.jdi.Mirror;

import java.util.ArrayList;
import java.util.List;

/*
操作给定的二叉树，将其变换为源二叉树的镜像。
二叉树的镜像定义：源二叉树
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
* */

public class 镜像二叉树 {

    public static void main(String[] args) {
        List<TreeNode> list = new ArrayList<>();
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(3);
        rootNode.left.right = new TreeNode(4);

        Mirror(rootNode);
    }


    public static void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode temp = root.right;;
        root.right = root.left;
        root.left = temp;
        if (root.left != null){
            Mirror(root.left);
        }

        if (root.right != null){
            Mirror(root.right);
        }

    }
}
