package BinaryTree;

public class mainWithOutTraversal {
    public static void main(String[] args) {
        BinaryTreeNode<String> root = new BinaryTreeNode("Root");

        BinaryTreeNode<String> left = new BinaryTreeNode("Left");
        BinaryTreeNode<String> right = new BinaryTreeNode("Right");

        root.addLeft(left);
        right.addParentToRight(root);

        System.out.println(root.getLeft().getData().toString());
        System.out.println(root.getRight().getData().toString());
    }
}
