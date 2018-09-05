package com.yelan;

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
