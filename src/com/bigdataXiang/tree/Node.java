package com.bigdataXiang.tree;

/**
 * Created by timeloveboy on 2016/10/22.
 */
public class Node<K, V> {
    private K key;

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    private V value;

    public Node(K key, V value) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
    @Override
    public String toString() {
        return key.toString();
    }
}
