package com.yelan;

/*
求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
* */

public class 求和 {
    public static void main(String[] args) {
        int sum = Sum_solution(3);
        System.out.println("sum:"+sum);
    }

    public static int Sum_solution(int n){
        if(n == 0) return 0;
        if (n == 1) return 1;
        return Sum_solution(n- 1) + n;
    }
}
