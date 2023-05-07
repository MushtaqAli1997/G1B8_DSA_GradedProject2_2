package assinment2;

public class SkewedBST {

	static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static Node convertToSkewedTree(Node root) {
		// Base case
		if (root == null) {
			return null;
		}

		Node left = convertToSkewedTree(root.left);

		if (left != null) {
			Node rightmost = left;
			while (rightmost.right != null) {
				rightmost = rightmost.right;
			}
			rightmost.right = root;
		}

		Node right = convertToSkewedTree(root.right);

		root.left = null;
		root.right = right;
		return left != null ? left : root;
	}

	public static void inorderTraversal(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}

	public static void main(String[] args) {

		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);

		Node skewedRoot = convertToSkewedTree(root);
		inorderTraversal(skewedRoot);
	}
}

