package com.yelan;

import java.util.ArrayList;
import java.util.List;

/*
*
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
* */

public class 构建乘积数组 {
    public static void main(String[] args) {
        
    }
    
    public static int[] multiply(int[] A){
        int length = A.length;
        int[] multiplyArray = new int[length];

        for (int i = 0; i < length; i++) {
            multiplyArray[i] = 1;
            for (int j = 0; j < length; j++) {
                if (i == j) continue;
                multiplyArray[i] = multiplyArray[i] * A[j];
            }
        }
        
        return multiplyArray;
    }

    public static int[] multiply2(int[] A){
        int length = A.length;
        int[] multiplyArray = new int[length];

        if (length != 0){
            multiplyArray[0] = 1;
            //计算下三角连乘
            for(int i = 1; i < length; i++){
                multiplyArray[i] = multiplyArray[i-1] * A[i-1];
            }
            int temp = 1;
            //计算上三角
            for(int j = length-2; j >= 0; j--){
                temp *= A[j+1];
                multiplyArray[j] *= temp;
            }
        }

        return multiplyArray;
    }
}
