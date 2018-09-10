package com.yelan;


/*
* 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
* */

import java.util.ArrayList;
import java.util.List;

public class 把二叉树打印成多行 {

    public static void main(String[] args){

    }


//    ArrayList<ArrayList<TreeNode>> totalNodeList = new ArrayList<ArrayList<TreeNode>>();
    ArrayList<ArrayList<Integer>> totalList = new ArrayList<ArrayList<Integer>>();

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null) return totalList;
        ArrayList<TreeNode> firstList = new ArrayList<>();
        ArrayList<Integer> valList = new ArrayList<>();
        firstList.add(pRoot);
        valList.add(pRoot.val);
        totalList.add(valList);
        nextNodeList(firstList);
        return totalList;
    }

    void nextNodeList(ArrayList<TreeNode> nodeList){

        if(nodeList.size() == 0) return;

        int length = nodeList.size();
        ArrayList<TreeNode> list = new ArrayList<>();
        ArrayList<Integer> valList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            TreeNode left = nodeList.get(i).left;
            TreeNode right = nodeList.get(i).right;
            if (left != null){
                list.add(left);
                valList.add(left.val);
            }
            if (right != null){
                list.add(right);
                valList.add(right.val);
            }
        }
        if (valList.size() != 0){
            totalList.add(valList);
            nextNodeList(list);
        }
    }


}
