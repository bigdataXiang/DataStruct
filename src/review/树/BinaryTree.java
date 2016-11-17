package review.树;

/**
 * Created by bigdataxiang on 16-11-16.
 */
public class BinaryTree {

    public Node root;

    /**
     *
     * 内部节点类
     * @author yhh
     */
    private class Node{
        private Node left;
        private Node right;
        private int data;
        public Node(int data){
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

    public BinaryTree(){
        root = null;
    }

    /**
     * 递归创建二叉树
     * @param node
     * @param data
     */
    public void buildTree(Node node,int data){
        //如果根节点为null，则将data的值设为根
        if(root == null){
            root = new Node(data);
        }else{
            //判断data的值与根节点的大小关系，如果小于根节点则将该值
            //赋值给左子树，如果大于根节点则将该值赋值给右子树
            if(data < node.data){
                if(node.left == null){
                    node.left = new Node(data);
                }else{
                    buildTree(node.left,data);
                }
            }else{
                if(node.right == null){
                    node.right = new Node(data);
                }else{
                    buildTree(node.right,data);
                }
            }
        }
    }

    /**
     * 前序遍历 :根左右
     * @param node
     */
    public void preOrder(Node node){
        if(node != null){
            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    /**
     * 中序遍历 ：左根右
     * @param node
     */
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }

    /**
     * 后序遍历 ：左右根
     * @param node
     */
    public void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+" ");
        }
    }




}
