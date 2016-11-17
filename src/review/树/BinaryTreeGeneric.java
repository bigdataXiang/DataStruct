package review.树;


/**
 * Created by bigdataxiang on 16-11-17.
 */
public class BinaryTreeGeneric {

    public BinaryNode<Integer,Integer> root;

    private class BinaryNode<K,V>{

        K key;
        V value;

        public BinaryNode(K key,V value) {
            this.value = value;
            this.key = key;
        }

        private BinaryNode<K,V> left;
        private BinaryNode<K,V> right;
        private BinaryNode<K,V> data;
        public BinaryNode(BinaryNode<K,V> data){
            this.left.key = null;
            this.left.value = null;
            this.right.key = null;
            this.right.value = null;
            this.data.key = data.key;
            this.data.value = data.value;
        }
    }

    public BinaryTreeGeneric(){
        root = null;
    }

    public void buildTree(BinaryNode<Integer,Integer> node, int data){

        if(root == null){
            root=new BinaryNode(data,data);
        }else{

            if(data < node.data.value){
                if(node.left == null){
                    node.left= new BinaryNode(data,data);
                }else{
                    buildTree(node.left,data);
                }
            }else{
                if(node.right == null){
                    node.right = new BinaryNode(data,data);
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
    public void preOrder(BinaryNode<Integer,Integer> node){
        if(node != null){
            System.out.print(node.data.key+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
