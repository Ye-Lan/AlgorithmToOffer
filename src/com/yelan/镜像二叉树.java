package com.yelan;

import com.sun.jdi.Mirror;

import java.util.ArrayList;
import java.util.List;


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
