package com.bigdataXiang.tree;

/**
 * Created by timeloveboy on 16-10-24.
 */
public class AVLNode<K, V extends Comparable> extends BinaryNode {
    public AVLNode(K key, V value) {
        super(key, value);
    }

    @Override
    public AVLNode getLeft() {
        return (AVLNode) super.getLeft();
    }

    @Override
    public AVLNode getRight() {
        return (AVLNode) super.getRight();
    }

    /*
    * LL：左左对应的情况(左单旋转)。
    *
    * 返回值：旋转后的根节点
    */
    private AVLNode<K, V> leftLeftRotation(AVLNode k2) {
        AVLNode<K, V> k1;
        k1 = k2.getLeft();
        k2.setLeft(k1.getRight());
        k1.setRight(k2);
        return k1;
    }

    /*
     * RR：右右对应的情况(右单旋转)。
     *
     * 返回值：旋转后的根节点
     */
    private AVLNode rightRightRotation(AVLNode k1) {
        AVLNode k2;

        k2 = k1.getRight();
        k1.setRight(k2.getLeft());
        k2.setLeft(k1);

        return k2;
    }

    /*
     * LR：左右对应的情况(左双旋转)。
     *
     * 返回值：旋转后的根节点
     */
    private AVLNode leftRightRotation(AVLNode k3) {
        k3.setLeft(rightRightRotation(k3.getLeft()));
        return leftLeftRotation(k3);
    }

    /*
     * RL：右左对应的情况(右双旋转)。
     *
     * 返回值：旋转后的根节点
     */
    private AVLNode rightLeftRotation(AVLNode k1) {
        k1.setRight(leftLeftRotation(k1.getRight()));
        return rightRightRotation(k1);
    }

    public void add(K key, V value) {

    }
}
