package com.yelan;

/*
* 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
* 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
* */

import java.util.ArrayList;
import java.util.List;

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class 二叉树的下一个结点 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null) return null;
        //作为根节点
        if(pNode.right != null){
            TreeLinkNode node = pNode.right;
            while (node != null){
                if(node.left == null) return node;
                node = node.left;

            }
        }
        //作为父节点的右节点
        while (pNode.next != null){
            TreeLinkNode parentNode = pNode.next;
            if(pNode == parentNode.left) return parentNode;
            pNode = parentNode;
        }

        return null;
    }

}
