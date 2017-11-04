/* Lowest Common Ancestor of 2 nodes in a Binary Tree
 * Given a binary tree and 2 tree nodes A and B, find the lowest common ancestor of the nodes.
 * https://www.youtube.com/watch?v=NBcqBddFbZw
 */
public class BinaryTree {
	Node root;
  
    public Node getBinaryTree(Node A, Node B) {       
        return getBinaryTree(root, A, B); 
    }
 
    private Node getBinaryTree(Node root, Node A, Node B) {
         
        if(root == null) {
            return null;
        }
         
        // If we find p or q, we return the node
        if(root == A || root == B)
            return root;
         
        // Recursive calls to find LCA in left and right subtrees
        Node leftNode = getBinaryTree(root.left, A, B);
        Node rightNode = getBinaryTree(root.right, A, B);
         
        // If we found p and q in left or right subtree of the rootent node, 
        // this means rootent node is a common ancestor, so return the node
        if(leftNode != null && rightNode != null)
            return root;
         
        // If we found p or q in left or right subtree of the rootent node,
        // the means rootent node is an ancestor, return the node
        if(leftNode == null) {
            return rightNode;
        } else {
            return leftNode;
        }
    }
     
    /*Defines a tree node*/
    class Node {
         
        int data;
        Node left, right;
         
        public Node(int data, Node left, Node right) {
            super();
            this.data = data;
            this.left = left;
            this.right = right;
        }
                       
        public Node() {
            super();
        }
 
        public Node(int data) {
            super();
            this.data = data;
        }
         
        @Override
        public String toString() {
            return data+""; 
        }
    }
     
    /*
     * *******************************************
     * Methods for testing getBinaryTree
     * *******************************************
     */
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createSampleTree();
        Node A = tree.root.left.left;   // Node 4
        Node B = tree.root.right;            // Node 3
        Node lca = tree.getBinaryTree(A, B);
        System.out.println("LCA of " + A.data + " and " + B.data + " is " + lca);
    }
     
    /*
     * Create a sample tree
     *              1
     *      2               3
     * 4        5       6       7
     * 
     */
    public void createSampleTree() {
        root = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));       
    }
 
    //Print inorder traversal
  
    public void printInorder() {
        printInorder(root);
    }
     
    private void printInorder(Node root) {
        if(root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
}
        