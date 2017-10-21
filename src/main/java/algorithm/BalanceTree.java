package main.java.algorithm;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-16 22:22
 * Description:左子树深度与右子树深度值不超过1
 */
public class BalanceTree {
    // [1]遍历方法-每个节点会重复多次，不太好的方法
    private static boolean isBalanceTree(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        TreeDepth depth = new TreeDepth();
        int leftHigh = depth.treeDepth(root.getLeft());
        int rightHigh = depth.treeDepth(root.getRight());

        int diff = Math.abs(leftHigh - rightHigh);
        if (diff > 1){
            return false;
        }
        return isBalanceTree(root.getLeft()) && isBalanceTree(root.getRight());
    }
}
