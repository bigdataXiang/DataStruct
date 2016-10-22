package com.bigdataXiang.tree;

/**
 * Created by timeloveboy on 16/10/20.
 */
public class TreeNode<T> {

    private T value;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
