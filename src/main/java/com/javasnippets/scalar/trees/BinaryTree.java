package com.javasnippets.scalar.trees;

/**
 * Binary tree has 0 or 1 or 2 children
 *
 * ROOT = Start of the tree
 * LEAF = Nodes with 0 children
 *
 */
public class BinaryTree {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }


    public static void main(String[] args) {
        var root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(8);
        root.left.right = new TreeNode(2);

        System.out.println(root);

        search(2, root);
        search(5, root);
    }

    static void search(int data, TreeNode root) {
        if(root == null) return;
        if(root.data == data)   System.out.println(root);
        search(data, root.left);
        search(data, root.right);
    }

}
