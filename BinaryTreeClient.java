import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryTreeClient {

	public static void main(String[] args) throws IOException
	{
		BinaryTree bt = new BinaryTree();
		bt.addNode(8);
		bt.addNode(5);
		bt.addNode(6);
		bt.addNode(4);
		bt.addNode(15);
		bt.addNode(1);
		//bt.printTreeInOrder();
		
		int[] arr = {1,4,5,6,8,15};
		TreeNode root = BinaryTree.createBalancedTree(arr);
		HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		
		BinaryTree.verticalSum(map, root, 0);
		BinaryTree.printTreeInOrder(root);
		BinaryTree.LevelOrderLinkedList(root);
		if(bt.checkBalanced(bt.root))
			System.out.println("Balanced..");
		else
			System.out.println("Imbalanced..");
		List<Integer> values = new ArrayList<Integer>(); 
		bt.printTreeInOrder();
		bt.printTreePreOrder();
		bt.printTreePostOrder();
		bt.printPaths(bt.root, values);
		bt.serialize();
		
		TreeNode nt = bt.lowestCommonAncestor(bt.root, 5, 155);
		if(nt!=null)
			{
			System.out.println("LCA is " +nt.data);
			}
		else
		{
			System.out.println("LCA is null");
		}
	}
}
