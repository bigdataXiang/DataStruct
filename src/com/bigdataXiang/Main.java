package com.bigdataXiang;

import com.bigdataXiang.regexp.Regexp;
import com.bigdataXiang.sort.InsertionSort;
import com.bigdataXiang.sort.Merge;
import com.bigdataXiang.sort.SelectionSort;
import com.bigdataXiang.sort.Sortable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        com.bigdataXiang.regexp.Regexp r=new Regexp();
//        r.test();
//        Integer[] array={34,8,64,51,32,21};
//        for (int i:array) {
//            System.out.print(i+"\t");
//        }
//        System.out.println();
//        Merge.sort(array);
//        for (int i:array) {
//            System.out.print(i+"\t");
//        }
      /*  System.out.println("输入字符串：");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        boolean appear=false;
        List<String> substr= new ArrayList<String>();

        int len=str.length();
        for(int i=0;i<str.length();i++){

            String nowstr=str.substring(i,i+1);
            int a=nowstr.compareTo("A");
            int b=nowstr.compareTo("Z");
            if(a>=0&&b<=0){
                substr.add(nowstr);
                appear=true;
            }else if(nowstr.equals(" ")&&appear){
                substr.add(nowstr);
            }
        }
        for(int i=0;i<substr.size();i++){
            System.out.print(substr.get(i));
        }
*/
        boolean end=false;
        int  current=0;
        while (!end){
            System.out.println("装订文件数binding:");
            Scanner in=new Scanner(System.in);
            int binding=in.nextInt();
            current+=binding;

            System.out.println("摘除文件数remove:");
            in=new Scanner(System.in);
            int remove=in.nextInt();



            if(remove>current){
                current=0;
            }else {
                current-=remove;
            }
            System.out.println("当前文件数current:"+current);

            System.out.println("是否结束计算？true/false:");
            in=new Scanner(System.in);
            end=in.nextBoolean();

        }



    }
}
