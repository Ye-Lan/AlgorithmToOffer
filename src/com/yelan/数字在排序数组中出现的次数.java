package com.yelan;

/*
*
统计一个数字在排序数组中出现的次数。
*
* */

public class 数字在排序数组中出现的次数 {

    public static void main(String[] args){
        int index = GetNumberOfK(new int[]{1,2,2,3},2);
        System.out.println(index);

    }


    public static int GetNumberOfK(int [] array , int k) {
        int count = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == k){
                count++;
                if (i == length - 1) break;
                if (array[i+1] != k) break;
            }
        }
        return count;
    }

//    public static int GetNumberOfK(int [] array , int k) {
//        int length = array.length;
//        if(length == 0) return 0;
//        if(length == 1 ) return array[0] == k ? 1 : 0;
//
//
//        int count = 0;
//        int left = 0;
//        int middle = -1;
//        int right = length - 1;
//
//        int sort = array[left] - array[right];
//        if (sort == 0){
//            return array[0] == k ? length : 0;
//        }
//
//        while (array[middle] != k && middle != 0){
//            middle = (int) ((left + right) * 0.5);
//            if (middle == 0)return 0;
//
//            if (sort > 0){ //降序
//                if (array[middle] - k > 0){
//                    left = middle;
//                }else{
//                    right = middle;
//                }
//            }else{
//                if (array[middle] - k < 0){
//                    left = middle;
//                }else{
//                    right = middle;
//                }
//            }
//
//        }
//
//        if (array[middle] != k) return 0;
//    }

}
