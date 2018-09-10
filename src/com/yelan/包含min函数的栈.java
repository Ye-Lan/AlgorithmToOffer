package com.yelan;
/*
* 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
* 
* tip:
* 注意时间复杂度为O(1)代表不能遍历，只能直接取
* 出栈的之后,stackmin要保持当前data的最小的值
* top 代表栈要取出的值
* pop 移除top指针指向的值
* */

import javax.xml.crypto.Data;
import java.util.Stack;

class minStack{
    
    Stack<Integer> stackData = new Stack<Integer>();
    Stack<Integer> stackmin = new Stack<Integer>();
    
    public void push(int node) {

        stackData.push(node);

        if (stackmin.empty() || node < stackmin.peek()){
            stackmin.push(node);
        }else{
            stackmin.push(stackmin.peek());
        }
        
    }

    public void pop() {
        stackData.pop();
        stackmin.pop();
    }

    public int top() {
        return stackData.peek();
    }

    public int min() {
        return stackmin.peek();
    }
}

public class 包含min函数的栈 {
    public static void main(String[] args){
        Stack stack = new Stack();
    }



}
