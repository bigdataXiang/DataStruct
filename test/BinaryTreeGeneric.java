/**
 * Created by bigdataxiang on 16-11-17.
 */
public class BinaryTreeGeneric {
    public static void main(String[] args) {
        int[] a = {36,4,12,45,21,6,111};
        review.树.BinaryTreeGeneric bTree = new review.树.BinaryTreeGeneric();
        for (int i = 0; i < a.length; i++) {
            bTree.buildTree(bTree.root, a[i]);
        }
        bTree.preOrder(bTree.root);
        System.out.println();
    }
}
