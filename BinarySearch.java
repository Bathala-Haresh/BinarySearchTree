package com.bst;
class BST { 
	//node class that defines BST node
	class Node { 
		int key; 
		Node left, right; 

		public Node(int data){ 
			key = data; 
			left = right = null; 
		} 
	} 
	// BST root node 
	Node root; 

	// Constructor for BST =>initial empty tree
	BST(){ 
		root = null; 
	} 
	// insert a node in BST 
	void insert(int key)  { 
		root = insert_Recursive(root, key); 
	} 

	//recursive insert function
	Node insert_Recursive(Node root, int key) { 
		//tree is empty
		if (root == null) { 
			root = new Node(key); 
			return root; 
		} 
		//traverse the tree
		if (key < root.key)     
			//insert in the left subtree
			root.left = insert_Recursive(root.left, key); 
		else if (key > root.key)    
			//insert in the right subtree
			root.right = insert_Recursive(root.right, key); 
		
		return root; 
	} 

	// method for inorder traversal of BST 
	void inorder() { 
		inorder_Recursive(root); 
	} 

	// recursively traverse the BST  
	void inorder_Recursive(Node root) { 
		if (root != null) { 
			inorder_Recursive(root.left); 
			System.out.print(root.key + " "); 
			inorder_Recursive(root.right); 
		} 
	} 
}
public class BinaryTree{
	public static void main(String[] args)  { 
		//create a BST object
		BST bst = new BST(); 
		//insert data into BST
		bst.insert(56); 
		bst.insert(30); 
		bst.insert(70); 
		//print the BST
		System.out.println("The BST Created with input data(Left-root-right):"); 
		bst.inorder(); 

		
	} 
}