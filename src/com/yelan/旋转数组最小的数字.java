package com.yelan;

import javax.sound.midi.MidiDevice;

/*
* 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
* 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
* 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
* NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
* */
public class 旋转数组最小的数字 {

    public static void main(String[] args){
        int min = minNumberInRotateArray(new int[]{3,4,6,1,2});
        System.out.println("min:"+min);
    }

    public static int minNumberInRotateArray(int[] array){
        if (array.length == 0) return 0;
        int min = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            min = Math.min(min,array[i]);
        }
        return min;
    }

    public static int minNumberInRotateArray2(int[] array){
        if (array.length == 0) return 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) //该数组是一个递增数组，通过旋转后，最小数就是分界线
                return array[i + 1];
        }
        return array[0];
    }

    //二分查找法
    public static int minNumberInRotateArray3(int[] array){
        if (array.length == 0) return 0;
        int left = 0;
        int right = array.length - 1;
        int middle = -1;

        while (array[left] >= array[right]){
            if (right - left == 1){
                middle = right;
                break;
            }

            middle = (int) ((left + right) * 0.5);
            if (array[middle] >= array[left]){
                left = middle;
            }
            if (array[middle] <= array[right]){
                right = middle;
            }
        }

        return array[middle];
    }

}
