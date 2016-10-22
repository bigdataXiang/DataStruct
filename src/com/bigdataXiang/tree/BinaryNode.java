package com.bigdataXiang.tree;

/**
 * Created by timeloveboy on 16/10/20.
 */
public class BinaryNode<T> extends ComparedNode{
    private BinaryNode left;
    private BinaryNode right;
    public BinaryNode(T value) {
        super(value);
    }
    public void setLeft(BinaryNode left) {
        this.left =left;
    }
    public void setRight(BinaryNode right) {
        this.right =right;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public BinaryNode getRight() {
        return right;
    }



}
