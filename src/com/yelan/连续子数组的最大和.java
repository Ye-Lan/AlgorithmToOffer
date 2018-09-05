package com.yelan;

public class 连续子数组的最大和 {
    public static void main(String[] args) {

    }

    public int FindGreatestSumOfSubArray(int[] array){
        int result = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum=Math.max(sum+array[i], array[i]);
            result=Math.max(sum, result);
        }
        return result;
    }

}
