package com.bigdataXiang.tree;

/**
 * Created by timeloveboy on 2016/10/22.
 */
public class BinarySortedNode<T>  extends BinaryNode{
    public BinarySortedNode(T value) {
        super(value);
    }

    @Override
    public BinarySortedNode getLeft() {
        return (BinarySortedNode)super.getLeft();
    }

    @Override
    public BinarySortedNode getRight() {
        return (BinarySortedNode)super.getRight();
    }

    public void add(Object value){
        BinarySortedNode n=new BinarySortedNode(value);
        if(n.compareTo(this)>0){
            if(getLeft()!=null){
               getLeft().add(value);
            }else {
                setLeft(new BinarySortedNode(value));
            }
        }else {
            if(getRight()!=null){
                getRight().add(value);
            }else {
                setRight(new BinarySortedNode(value));
            }
        }
    }
}
