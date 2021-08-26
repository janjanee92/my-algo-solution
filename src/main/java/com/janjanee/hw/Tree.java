package com.janjanee.hw;

/**
 * Q4. 높이가 최소가 되는 이진 탐색 트리 생성
 *
 * [참고자료]
 * - https://www.geeksforgeeks.org/relationship-number-nodes-height-binary-tree/
 * - https://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
 */
public class Tree {

    private Node root;

    static class Node {
        int value;
        Node left;
        Node right;

        Node (int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    public void createMinimumHeightBST(int[] arr) {
        root = addRecursive(arr, 0, arr.length - 1);
    }

    private Node addRecursive(int[]arr, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        Node node = new Node(arr[mid]);
        node.left = addRecursive(arr, start, mid - 1);
        node.right= addRecursive(arr, mid + 1, end);
        return node;
    }

    public int findHeight() {
        return findHeight(root);
    }

    private int findHeight(Node node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }
}