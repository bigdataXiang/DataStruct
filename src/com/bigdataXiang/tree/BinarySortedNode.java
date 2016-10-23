package com.bigdataXiang.tree;

/**
 * Created by timeloveboy on 2016/10/22.
 */
public class BinarySortedNode<K, V extends Comparable> extends BinaryNode implements Comparable {
    public BinarySortedNode(K key, V value) {
        super(key, value);
    }

    @Override
    public int compareTo(Object o) {
        try {
            Double d = Double.parseDouble(o.toString());
            Double self = Double.parseDouble(getValue().toString());
            if (d - self > 0) {
                return 1;
            } else if (d - self == 0) {
                return 0;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public BinarySortedNode getLeft() {
        return (BinarySortedNode)super.getLeft();
    }

    @Override
    public BinarySortedNode getRight() {
        return (BinarySortedNode)super.getRight();
    }

    public void add(K key, V value) {
        BinarySortedNode n = new BinarySortedNode(key, value);
        if(n.compareTo(this)>0){
            if(getLeft()!=null){
                getLeft().add(key, value);
            }else {
                setLeft(new BinarySortedNode(key, value));
            }
        }else {
            if(getRight()!=null){
                getRight().add(key, value);
            }else {
                setRight(new BinarySortedNode(key, value));
            }
        }
    }
}
