/**
 * Created by bigdataxiang on 16-11-16.
 */
public class BinaryTree {
    public static void main(String[] args) {
        int[] a = {36,4,12,45,21,6,111};
        review.树.BinaryTree bTree = new review.树.BinaryTree();
        for (int i = 0; i < a.length; i++) {
            bTree.buildTree(bTree.root, a[i]);
        }
         bTree.preOrder(bTree.root);
         System.out.println();
         bTree.inOrder(bTree.root);
         System.out.println();
         bTree.postOrder(bTree.root);
    }
}
