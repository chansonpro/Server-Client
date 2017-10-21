package main.java.algorithm;


/**
 * User: chanson-pro
 * Date-Time: 2017-10-16 20:59
 * Description:求二叉树的深度，if只存在左子数，深度=左子树深度+1；
 */
public class TreeDepth {
    // [1]递归方式
    public int treeDepth(BinaryTreeNode root) {
        if (root == null){
            return 0;
        }
        int leftDepth = treeDepth(root.getLeft());// 递归求左子数深度
        int rightDepth = treeDepth(root.getRight()); // 递归右子数深度
        int diff = leftDepth - rightDepth;
        return diff>0 ? (leftDepth + 1):(rightDepth + 1);
    }
    // [2]非递归方式-层次遍历
    // 添加last与nlast标记，参考二叉树按层打印（分层）思路
    /*private static int treeDepth2(BinaryTreeNode root) {


    }*/

}
class BinaryTreeNode{
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    private int value;

    public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}