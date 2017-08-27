import java.util.*;
public class BinaryTree {
	
	 class Node{
		int data;
		Node left, right;
		
	     Node(int d){
			data = d;
			left = right = null;
		}
	}//end of Node class
	
	 //main method to invoke level order traversal algorithm
	public static void main(String[] args){
		//create a binary tree
		BinaryTree bi = new BinaryTree();
		Node root = bi.createNewNode();
		levelOrderTraversal(root);
		
	}//end of main method
	
	public Node createNewNode(){
		Node root = new Node(40);
		Node node20 = new Node(20);
		Node node60 = new Node(60);
		Node node10 = new Node(10);
		Node node30 = new Node(30);
		Node node50 = new Node(50);
		Node node70 = new Node(70);
		
		
		node20.right = node30;
		node60.left = node50;
		node60.right = node70;
		
		root.left = node20;
		root.right = node60;
		node20.left = node10;
		
				
		return root;
	}
	
	public static void levelOrderTraversal(Node root){
		
		Queue queue= new LinkedList();
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node tempNode = (Node)queue.poll();
			
			System.out.print(tempNode.data+" ");
			if(tempNode.left != null){
				queue.add(tempNode.left);
			}
			if(tempNode.right != null){
				queue.add(tempNode.right);
			}
		}
		
		
	}
}
