package com.yelan;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 *
 * 输出描述
 * 如果当前字符流没有存在出现一次的字符，返回#字符。
 *
 * */


public class 字符流中第一个不重复的字符 {

    public static void main(String[] args){
//        String s = "eedsad";
//        for (int i = 0; i < s.length(); i++) {
//            Insert(s.charAt(i));
//            System.out.println(FirstAppearingOnce());
//        }
    }
    //不能使用 Array
//
//    private static List<Character> charLink = new ArrayList<>();
//    //Insert one char from stringstream
//    public static void Insert(char ch)
//    {
//        if(charLink.contains(ch)){
//            charLink.remove(Character.valueOf(ch));
//        }else{
//            charLink.add(ch);
//        }
//    }
//    //return the first appearence once char in current stringstream
//    public static char FirstAppearingOnce()
//    {
//        if (charLink.size() != 0){
//            return charLink.get(0);
//        }else {
//            return '#';
//        }
//
//    }


    //---------------------------------
    int[] hash = new int[256];
    StringBuilder s = new StringBuilder();
    public void Insert(char ch){
        s.append(ch);
        hash[ch]++;
    }

    public char FirstAppearingOnce(){
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if(hash[s.charAt(i)] == 1) return s.charAt(i);
        }
        return '#';
    }

}
