/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    public Node connect(Node root) {

        // If tree is empty or has only one node
        if (root == null || root.left == null) {
            return root;
        }

        Queue<Node> queue = new LinkedList<>();

        // Push root
        queue.offer(root);

        // Push NULL to mark the end of the first level
        queue.offer(null);

        Node prev = null;

        while (!queue.isEmpty()) {

            Node curr = queue.poll();

            // End of current level
            if (curr == null) {

                // Connect the last node of the level to NULL
                if (prev != null) {
                    prev.next = null;
                }

                // Reset prev for the next level
                prev = null;

                // If queue is empty, traversal is complete
                if (queue.isEmpty()) {
                    break;
                }

                // Mark the end of the next level
                queue.offer(null);
            }
            else {

                // Push left child
                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                // Push right child
                if (curr.right != null) {
                    queue.offer(curr.right);
                }

                // Connect previous node with current node
                if (prev != null) {
                    prev.next = curr;
                }

                // Update previous node
                prev = curr;
            }
        }

        return root;
    }
}