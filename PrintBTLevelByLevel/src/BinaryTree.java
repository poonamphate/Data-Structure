//print binary tree level by level
//explanation: using two queue approach https://www.youtube.com/watch?v=7uG0gLDbhsI&t=192s
//T(O) = O(N); S(O) = O(N)

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	 Node root;

	public static class Node{
		int data;
		Node left, right;

		Node(int d){
			data = d;
		}
	}
	
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		Node root = tree.createNewNode();
		
		
		printLevelByLevel(root);
	}
	
	public Node createNewNode(){
		Node root = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		
		root.left = node2;
		root.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		
		return root;
	}
	
	public static void printLevelByLevel(Node root){
		if(root==null){
			return;
		}
		
		Queue<Node> q1 = new LinkedList<>();
		Queue<Node> q2 = new LinkedList<>();
		
		q1.add(root);
		Node current;
		
		 while (!q1.isEmpty() || !q2.isEmpty()) {
	            while (!q1.isEmpty()) {
	                current = q1.poll();
	                System.out.print(current.data + " ");
	                if (current.left != null) {
	                    q2.offer(current.left);
	                }
	                if (current.right != null) {
	                    q2.offer(current.right);
	                }
	            }
	            System.out.println();
	            while (!q2.isEmpty()) {
	            	current = q2.poll();
	                System.out.print(current.data + " ");
	                if (current.left != null) {
	                    q1.offer(current.left);
	                }
	                if (current.right != null) {
	                    q1.offer(current.right);
	                }
	            }
	            System.out.println();
	        }
		
		
	}
}
