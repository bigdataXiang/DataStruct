package com.bigdataXiang.tree;

import com.bigdataXiang.util.Log;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by timeloveboy on 2016/10/22.
 */
public class 二叉树<T>{
    protected BinaryNode  root;

    public void 水平翻转() {
        if (root == null) {
            return;
        }
        root.水平翻转();
    }
    //region 非递归
    //先序遍历（非递归）
    public List<BinaryNode> 先序遍历_非递归() {
        List<BinaryNode> output=new LinkedList<BinaryNode>();
        Stack<BinaryNode> stack = new Stack<BinaryNode>();
        BinaryNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                output.add(node);
                stack.push(node);
                node = node.getLeft();
            }
            node = stack.pop();
            node = node.getRight();
        }
        return output;
    }
    //中序遍历（非递归）
    public List<BinaryNode> 中序遍历_非递归() {
        List<BinaryNode> output=new LinkedList<BinaryNode>();
        Stack<BinaryNode> stack = new Stack<BinaryNode>();
        BinaryNode node = root;
        while (node != null || !stack.isEmpty()) {

            while (node != null) {

                stack.push(node);
                node = node.getLeft();
            }
            node = stack.pop();
            output.add(node);
            node = node.getRight();
        }
        return output;
    }
    //后序遍历（非递归）
    public List<BinaryNode> 后序遍历_非递归() {
        List<BinaryNode> output=new LinkedList<BinaryNode>();
        Stack<BinaryNode> stack = new Stack<BinaryNode>();
        BinaryNode node = root;
        BinaryNode preNode = null;//表示最近一次访问的节点
        while (node != null || !stack.isEmpty()) {

            while (node != null) {

                stack.push(node);
                node = node.getLeft();
            }
            node = stack.peek();

            if (node.getRight() == null || node.getRight() == preNode) {
                output.add(node);
                node = stack.pop();
                preNode = node;
                node = null;
            } else {
                node = node.getRight();
            }
        }
        return output;

    }
    //endregion
    public List<BinaryNode> 先序遍历(){
        List<BinaryNode> output=new LinkedList<BinaryNode>();
        return root.先序遍历(output);
    }
    public List<BinaryNode> 中序遍历(){
        List<BinaryNode> output=new LinkedList<BinaryNode>();
        return root.中序遍历(output);
    }
    public List<BinaryNode> 后序遍历(){
        List<BinaryNode> output=new LinkedList<BinaryNode>();
        return root.后序遍历(output);
    }
    public static void main(String[] args) {
        //          0
        //     1         2
        //  3     4    5    6

        二叉树<Integer> tree = new 二叉树<>();
        tree.root = new BinaryNode<>(0);
        tree.root.setLeft(new BinaryNode(1));
        tree.root.setRight(new BinaryNode(2));
        tree.root.getLeft().setLeft(new BinaryNode(3));
        tree.root.getLeft().setRight(new BinaryNode(4));
        tree.root.getRight().setLeft(new BinaryNode(5));
        tree.root.getRight().setRight(new BinaryNode(6));

        tree.水平翻转();
        //          0
        //     2         1
        //  6     5    4    3

        Log.v("先序遍历",tree.先序遍历());
        Log.v("中序遍历",tree.中序遍历());
        Log.v("后序遍历",tree.后序遍历());
    }
}
