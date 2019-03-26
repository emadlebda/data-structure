package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal<E> {

    public void preOrderTraversal(BinaryTreeNode<E> t) {
        if (t != null) {
            t.getData();
            if (t.getLeft() != null)
                preOrderTraversal(t.getLeft());
            if (t.getRight() != null)
                preOrderTraversal(t.getRight());
        }
    }

    public void inOrderTraversal(BinaryTreeNode<E> t) {
        if (t == null) {
            return;
        }
        inOrderTraversal(t.getLeft());
        t.getData();
        inOrderTraversal(t.getRight());
    }

    public void postOrderTraversal(BinaryTreeNode<E> t) {
        if (t != null) {
            if (t.getLeft() != null)
                postOrderTraversal(t.getLeft());
            if (t.getRight() != null)
                postOrderTraversal(t.getRight());
            t.getData();
        }
    }

    public ArrayList<ArrayList<Integer>> levelOrder(BinaryTreeNode<E> root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return result;
        }
        //Use a queue to list elements in rows.
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < queue.size(); i++) {
                BinaryTreeNode<Integer> levelBinaryTreeNode = queue.poll();
                list.add(levelBinaryTreeNode.getData());//Add all  values from current level.
                if (levelBinaryTreeNode.getLeft() != null) {
                    queue.offer(levelBinaryTreeNode.getLeft());
                }
                if (levelBinaryTreeNode.getRight() != null) {
                    queue.offer(levelBinaryTreeNode.getRight());
                }
            }
            result.add(list);
        }
        return result;
    }
}