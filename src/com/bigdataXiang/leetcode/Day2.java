package com.bigdataXiang.leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Day2{
	public static void main(String[] args){
		reverseString2("hello world");
	}
	//当字符串s为连续的时候，可以使用StringBuilder
	public static void reverseString(String s){
		String reverse=new StringBuilder(s).reverse().toString();
	}
	
	//从字符串最后一个字符读起
	public static void reverseString2(String s){
		int len=s.length();
		for(int i=len-1;i>-1;i--){
			char c=s.charAt(i);
			System.out.print(c);
		}
	}
	
	//当字符串以某种符号（如空格）间隔开的时候
	public static void reverseString1(String s){
		 String[] sArr = s.split(" ");
		 List<String> list=new ArrayList<String>();
		 list = Arrays.asList(sArr);
		 Collections.reverse(list); 
		 
		 String reverse="";
		 for(String ch:list){
			 reverse+=ch+" ";
		 }
		 System.out.println(reverse);
	}
	
	/*输入两个整数，不使用四则运算求出这两个数的和 
	分析加法运算对应的位运算： 
	1 等价于两个数先做异或运算 – 相当于不考虑进位的加法 
	2 然后按位与运算并将与运算的和左移一位 – 相当于考虑进位 
	3 将1中的结果赋值给第一个数，将2中的结果赋值给第二个数 
	4 如果第二个数不为0，重复1 2 3*/
	public static int add(int num1, int num2){
		int sum = 0;
        int carry = 0;
        do{
            sum = num1 ^ num2;
            carry = (num1 & num2)<<1;

            num1 = sum;
            num2 = carry;
        }while(carry != 0);

        return num1;
    }
		 
	}
