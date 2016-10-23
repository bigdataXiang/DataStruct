package com.bigdataXiang.tree;

import java.util.List;

/**
 * Created by timeloveboy on 16/10/20.
 */
public class BinaryNode<K, V> extends Node {
    public BinaryNode getParent() {
        return parent;
    }

    public int getHeight() {
        int nodeheight = 0;
        if (parent != null) {
            return 1 + parent.getHeight(nodeheight);
        } else {
            return 1 + nodeheight;
        }
    }

    public int getHeight(int nodeheight) {
        if (parent != null) {
            return 1 + parent.getHeight(nodeheight);
        } else {
            return 1 + nodeheight;
        }
    }

    private BinaryNode parent;

    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(K key, V value) {
        super(key, value);
    }
    public void setLeft(BinaryNode left) {
        this.left =left;
        this.left.parent = this;
    }
    public void setRight(BinaryNode right) {
        this.right =right;
        this.right.parent = this;
    }
    public BinaryNode getLeft() {
        return left;
    }
    public BinaryNode getRight() {
        return right;
    }

    public void 水平翻转() {

        BinaryNode exchange = left;
        left = this.right;
        right = exchange;
        if (this.left != null) {
            this.left.水平翻转();
        }
        if (this.right != null) {
            this.right.水平翻转();
        }
    }
    public List<BinaryNode> 先序遍历(List<BinaryNode> output){
        output.add(this);
        if(this.left!=null){
            this.left.先序遍历(output);
        }
        if(this.right!=null){
            this.right.先序遍历(output);
        }
        return output;
    }
    public List<BinaryNode> 中序遍历(List<BinaryNode> output){

        if(this.left!=null){
            this.left.中序遍历(output);
        }
        output.add(this);
        if(this.right!=null){
            this.right.中序遍历(output);
        }
        return output;
    }
    public List<BinaryNode> 后序遍历(List<BinaryNode> output){
        if(this.left!=null){
            this.left.后序遍历(output);
        }
        if(this.right!=null){
            this.right.后序遍历(output);
        }
        output.add(this);
        return output;
    }

}
