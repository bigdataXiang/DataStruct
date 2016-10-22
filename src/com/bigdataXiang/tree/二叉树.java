package com.bigdataXiang.tree;

import com.bigdataXiang.util.Log;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by timeloveboy on 2016/10/22.
 */
public class 二叉树<T> {
    private TreeNode<T> root;

    public 二叉树() {
    }

    public 二叉树(TreeNode<T> root) {
        this.root = root;
    }

    //先序遍历（非递归）
    public List<TreeNode<T>> 先序遍历_非递归() {
        List<TreeNode<T>> output=new LinkedList<TreeNode<T>>();
        Stack<TreeNode<T>> stack = new Stack<TreeNode<T>>();
        TreeNode<T> node = root;
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
    public List<TreeNode<T>> 中序遍历_非递归() {
        List<TreeNode<T>> output=new LinkedList<TreeNode<T>>();
        Stack<TreeNode<T>> stack = new Stack<TreeNode<T>>();
        TreeNode<T> node = root;
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
    public List<TreeNode<T>> 后序遍历_非递归() {
        List<TreeNode<T>> output=new LinkedList<TreeNode<T>>();
        Stack<TreeNode<T>> stack = new Stack<TreeNode<T>>();
        TreeNode<T> node = root;
        TreeNode<T> preNode = null;//表示最近一次访问的节点
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
    public static void main(String[] args) {
        二叉树<Integer> tree = new 二叉树<Integer>();
        tree.root = new TreeNode<>(0);
        tree.root.setLeft(new TreeNode(1));
        tree.root.setRight(new TreeNode(2));
        tree.root.getLeft().setLeft(new TreeNode(3));
        tree.root.getLeft().setRight(new TreeNode(4));
        tree.root.getRight().setLeft(new TreeNode(5));
        tree.root.getRight().setRight(new TreeNode(6));

        Log.v(tree.先序遍历_非递归());
        Log.v(tree.中序遍历_非递归());
        Log.v(tree.后序遍历_非递归());
    }
}
