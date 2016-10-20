package com.bigdataXiang.tree;

/**
 * Created by timeloveboy on 16/10/20.
 */
public class BinarySortTree<T>{
    public Node getRoot() {
        return root;
    }
    private Node root;

    public BinarySortTree(Node root) {
        this.root = root;
    }
    public void insert(int _value) {
        Node node = root;

        boolean inserted = false;
        while(!inserted) {
            if (_value == node.getKey()) {
                inserted = true;
            } else if (_value < node.getKey()) {
                Node leftNode = node.getLeft();
                if (leftNode == null) {
                    leftNode = new Node(_value,null);
                    node.setLeft(leftNode);
                    inserted = true;
                } else {
                    node = leftNode;
                }
            }  else {
                Node rightNode = node.getRight();
                if (rightNode == null) {
                    rightNode = new Node(_value,null);
                    node.setRight(rightNode);
                    inserted = true;
                } else {
                    node = rightNode;
                }
            }
        }
    }
    private void removeNodeNoChild(Node parentNode, Node removeNode) {
        if (parentNode.getKey() == removeNode.getKey()) {
            return;
        } else if (parentNode.getKey() < removeNode.getKey()) {
            parentNode.setRight(null);
        } else {
            parentNode.setLeft(null);
        }
    }
    private Node[] searchRemoveNode(int _value) {
        Node parentNode = null;
        Node removeNode = root;

        while(removeNode != null) {
            if (removeNode.getKey() == _value) {
                break;
            }

            if (removeNode.getKey() < _value) {
                parentNode = removeNode;
                removeNode = removeNode.getRight();
            }

            if (removeNode.getKey() > _value) {
                parentNode = removeNode;
                removeNode = removeNode.getLeft();
            }
        }

        return new Node[]{parentNode, removeNode};
    }
    public void remove(int _value) {
        Node[] nodes = searchRemoveNode(_value);
        if (nodes == null || nodes.length != 2) {
            return;
        }

        Node parentNode = nodes[0];
        Node removeNode = nodes[1];

        int childFlag = 0; // 定义一个整型的数记录待删除节点的情况
        if (removeNode.getLeft() != null) {
            childFlag += (1 << 1);
        }
        if (removeNode.getRight() != null) {
            childFlag += 1;
        }

        switch (childFlag) {
            case 0:
                removeNodeNoChild(parentNode, removeNode);
                break;

            case 1:
                // 只有右孩子
                removeNodeOneChild(parentNode, removeNode);
                break;

            case 2:
                // 只有左孩子
                removeNodeOneChild(parentNode, removeNode);
                break;

            case 3:
                // 有两个孩子
                removeNodeTwoChild(parentNode, removeNode);
                break;

            default:
                throw new AssertionError();
        }
    }
    private void removeNodeOneChild(Node parentNode, Node removeNode) {
        if (parentNode.getKey() ==  removeNode.getKey()) {
            return;
        }

        if (removeNode.getKey() < parentNode.getKey()) {
            // 父节点的左孩子
            parentNode.setLeft(removeNode.getLeft() == null ? removeNode.getRight() : removeNode.getLeft());
        } else {
            // 父节点的右孩子
            parentNode.setRight(removeNode.getLeft() == null ? removeNode.getRight() : removeNode.getLeft());
        }
    }

    private void removeNodeTwoChild(Node parentNode, Node removeNode) {
        if (parentNode.getKey() ==  removeNode.getKey()) {
            return;
        }

        Node maxValueNode = maxValueNode(removeNode.getLeft());

        if (removeNode.getKey() < parentNode.getKey()) {
            // 父节点的左孩子
            parentNode.setLeft(maxValueNode);
        } else {
            // 父节点的右孩子
            parentNode.setRight(maxValueNode);
        }

        maxValueNode.setLeft(removeNode.getLeft());
        maxValueNode.setRight(removeNode.getRight());
    }
    private Node maxValueNode(Node node) {
        if (node == null || node.getLeft() == null) {
            return null;
        }

        Node parentNode = null;
        Node minValueNode = null;
        while(node.getRight() != null) {
            parentNode = node;
            minValueNode = node.getRight();
            node = minValueNode;
        }

        parentNode.setRight(null);

        return minValueNode;
    }
}
