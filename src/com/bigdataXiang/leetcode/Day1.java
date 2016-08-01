package com.bigdataXiang.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ZhouXiang on 2016/8/1.
 */
public class Day1 {
    /**
     * 挑选出大写字母
     */
    public static void getCapitalLetters(){
        System.out.println("输入字符串：");
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
    }

    /**
     * 统计当前装订的文件数
     */
    public static void StatisticsFile(){
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

    /**
     * 将一棵二叉树反转
     */
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    /**
     * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

       For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        List<Integer> before=new ArrayList<Integer>();
        List<Integer> end=new ArrayList<Integer>();

        for (int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n==0){
                end.add(0);
            }else{
                before.add(n);
            }
        }
        for (int i=0;i<nums.length;){
            while(i<before.size()){
               for(int j=0;j<before.size();j++){
                   int a=before.get(j);
                   nums[i]=a;
                   i++;
               }

            }
            for(int j=0;j<end.size();j++){
                int a=end.get(j);
                nums[i]=a;
                i++;
            }


        }
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    /**
     * 题目答案
     * @param nums
     */
    public static void moveZeroes_(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                for (int j=i+1;j<nums.length;j++){
                    if(nums[j]!=0){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                }
            }
        }
    }
}
