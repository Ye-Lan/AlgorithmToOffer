package com.yelan;

import javax.print.attribute.standard.NumberOfInterveningJobs;

/*
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
* */
public class 整数中1出现的次数 {
    public static void main(String[] args){
        int i = NumberOfBetween1AndN_Solution(80);
        System.out.println("count:"+i);
    }
    /*想不出*/
    public static int NumberOfBetween1AndN_Solution(int n){
        int count = 0;
        int index = 0;
        int first = 0;
        while (n > 0){
            index++;
            n = n / 10;
            if (n < 10){
                first  = n;
            }
        }
        count = (int) (Math.pow(10,index - 1) + 10 * (first + 1) * (index - 1));

        return count;
    }

    /*网上答案*/

    public static int NumberOfBetween1AndN_Solution2(int n){
        int ones = 0;
//        for (int m = 1; m <= n; m *= 10){
//            ones += (n / m + 8) / 10 * m + (n / m % 10 == 1) * (n % m + 1);
//        }
        return ones;
    }

}
