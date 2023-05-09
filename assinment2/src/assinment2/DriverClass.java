package assinment2;

import assinment2.SkewedBST.Node;

public class DriverClass {

	public static void main(String[] args) {
		SkewedBST bst = new SkewedBST();
		Node root = null;

		int[] values = { 50, 30, 60, 10, 55 };
		for (int value : values) {
			root = bst.insertNode(root, value);
		}

		Node skewedRoot = SkewedBST.convertToSkewedTree(root);

		System.out.println("Node values in ascending order:");
		SkewedBST.inorderTraversal(skewedRoot);
	}
}