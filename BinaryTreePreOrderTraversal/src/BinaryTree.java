import java.util.*;

public class BinaryTree {
	
	
	
	public static class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public static void main(String[] args){
		BinaryTree bi = new BinaryTree();
		Node root = createNode();
		//bi.preOrderTraversalRecurssion(root);
		bi.preOrderTraversalIterative(root);
		
		
	}
	
	public static Node createNode(){
		Node rootNode = new Node(40);
		Node node20 = new Node(20);
		Node node60 = new Node(60);
		Node node10 = new Node(10);
		Node node30 = new Node(30);
		Node node50 = new Node(50);
		Node node70 = new Node(70);
		
		rootNode.left = node20;
		rootNode.right = node60;
		node20.left = node10;
		node20.right = node30;
		node60.left = node50;
		node60.right = node70;
				
		return rootNode;
	}
	
	public void preOrderTraversalRecurssion(Node root){
		if(root != null)
		{
			System.out.print(root.data+" ");
			preOrderTraversalRecurssion(root.left);
			preOrderTraversalRecurssion(root.right);
		}
		
	}
	
	public void preOrderTraversalIterative(Node root){
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			Node tempNode = stack.pop();
			System.out.print(tempNode.data+" ");
			
			if(tempNode.right != null){
				stack.push(tempNode.right);
			}
			
			if(tempNode.left != null){
				stack.push(tempNode.left);
			}
			
			
		}
	}
	
}
