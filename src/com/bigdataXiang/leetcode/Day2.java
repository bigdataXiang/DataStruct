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
