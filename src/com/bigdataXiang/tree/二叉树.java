package com.bigdataXiang.tree;

import java.util.Stack;

/**
 * Created by timeloveboy on 2016/10/22.
 */
public class 二叉树<T> {
    private TreeNode<T> root;

    public 二叉树(TreeNode<T> root) {
        this.root = root;
    }

    //先序遍历（非递归）
    public void 先序遍历_非递归() {

        Stack<TreeNode<T>> stack = new Stack<TreeNode<T>>();
        TreeNode<T> node = root;
        while (node != null || !stack.isEmpty()) {

            while (node != null) {
                System.out.println(node.getValue());
                stack.push(node);
                node = node.getLeft();
            }
            node = stack.pop();
            node = node.getRight();
        }
    }
}
