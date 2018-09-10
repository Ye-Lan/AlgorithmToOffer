package com.yelan;

/*

输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
* */

public class 二进制中1的个数 {
    public static void main(String[] args){
        int count = NumberOf1(-1);
        System.out.println("count:"+count);
    }

    public static int NumberOf1(int n){
        int count = 0;
        while (n != 0){
            if ((n & 1) == 1){
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }

//    public int NumberOf1(int n) {
//        int count = 0;
//        while(n!= 0){
//            count++;
//            n = n & (n - 1);
//        }
//        return count;
//    }

}
