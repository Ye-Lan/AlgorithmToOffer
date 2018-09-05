package com.yelan;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class 二叉树的深度 {
    public static void main(String[] args) {

    }

    public int TreeDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int nleft = TreeDepth(root.left);
        int nright = TreeDepth(root.right);

        return nleft > nright ? (nleft + 1) :(nright + 1);
    }

    public int TreeDepth2(TreeNode pRoot)
    {
        if(pRoot == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(pRoot);
        int depth = 0, count = 0, nextCount = 1;
        while(queue.size()!=0){
            TreeNode top = queue.poll();
            count++;
            if(top.left != null){
                queue.add(top.left);
            }
            if(top.right != null){
                queue.add(top.right);
            }
            if(count == nextCount){
                nextCount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }

}
