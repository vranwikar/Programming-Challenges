import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class BinaryTree {

	TreeNode root;

	public BinaryTree()
	{
		this.root = null;
	}

	public void addNode(int data)
	{
		System.out.println("root is" +this.root);
		if(this.root==null)
		{
			System.out.println("Creating root element...");
			TreeNode root = new TreeNode(data);
			root.parent=null;
			root.left=null;
			root.right=null;
			this.root = root;
		}
		else
		{
			TreeNode current = root;
			TreeNode parent = null;
			while(true)
			{
				parent =current;
				if(data >= current.data)
				{
					//Insert in right tree
					current = current.right;
					if(current==null)
					{
						parent.right = new TreeNode(data);
						return;
					}
				}
				else
				{
					//Insert in left tree
					current = current.left;
					if(current==null)
					{
						parent.left = new TreeNode(data);
						return;
					}
				}

			}
		}
	}


	public void printTreeInOrder()
	{
		Stack<TreeNode> st = new Stack<TreeNode>();
		if(this.root==null)
			System.out.println("Empty Tree...");

		boolean done = true;
		TreeNode current = root;
		while(done)
		{
			if(current != null)
			{
				st.push(current);
				current = current.left;
			}
			else
			{
				if(!st.isEmpty())
				{
					current = st.pop();
					System.out.println("Node value is " +current.data);
					current = current.right;
				}
				else
					done = false;
			}
		}

	}

	public void printTreePreOrder()
	{
		Stack<TreeNode> st = new Stack<TreeNode>();
		if(this.root == null)
			System.out.println("Empty Tree...");

		TreeNode current = root;
		st.push(current);
		while(!st.empty())
		{
			current = st.pop();
			System.out.println("Element is " +current.data);

			if(current.right!= null)
			{
				st.push(current.right);
			}
			else{
				
				System.out.println(st);
			}
			if(current.left!=null)
			{
				st.push(current.left);
			}
			else{
				System.out.println(st);
			}

		}

	}

	public void printTreePostOrder()
	{
		Stack<TreeNode> st1 = new Stack<TreeNode>();
		Stack<TreeNode> st2 = new Stack<TreeNode>();

		if(this.root==null)
			System.out.println("Empty Tree...");
		TreeNode current = root;
		st1.push(current);

		while(!st1.isEmpty())
		{
			current = st1.pop();
			st2.push(current);
			if(current.left!=null)
				st1.push(current.left);
			if(current.right!=null)
				st1.push(current.right);
		}

		while(!st2.isEmpty())
		{
			TreeNode t = st2.pop();
			System.out.println("Priting element " +t.data);
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, int node1, int node2)
	{
		if(root==null)
		{
			System.out.println("Empty Tree...");
			return null;
		}
		if(root.data > node1 && root.data > node2)
		{
			return this.lowestCommonAncestor(root.left, node1, node2);
		}
		if(root.data < node1 && root.data < node2)
		{
			return this.lowestCommonAncestor(root.right, node1, node2);
		}
		return root;
		//System.out.println("LCA is " +root.data);
	}

	public void serialize() throws IOException
	{
		File f = new File("C:\\Vallabh\\PricemasterWorkspace\\Programs\\src\\Tree.txt");
		if(!f.exists())
			f.createNewFile();
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		writeToFile(this.root,bw);
		bw.close();
	}

	private static void writeToFile(TreeNode nd, BufferedWriter bw) throws IOException
	{
		if(nd==null)
			bw.write("# ");
		else
		{
			bw.write(nd.data+" ");
			writeToFile(nd.left, bw);
			writeToFile(nd.right, bw);
		}

	}
	public void deserialize() throws IOException
	{
		File f = new File("C:\\Vallabh\\PricemasterWorkspace\\Programs\\src\\Tree.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String st = null;
		while((st = br.readLine()) != null)
		{
			StringTokenizer stk = new StringTokenizer(st, " ");
			createTree(stk, 0);

		}
	}
	
	
	
	
	private static void createTree(StringTokenizer stk, int num)
	{
		String st = stk.nextToken();
		if(st.equals("#")){
		}
		else {
			
		}
		
	}

	public int height(TreeNode node) {
		if(node == null)
			return 0;
		else
			return Math.max(height(node.left), height(node.right)) +1;
	}
	public boolean checkBalanced(TreeNode node) {
		
		if(node == null) return true;
		
		int heightDiff = Math.abs(height(node.left) - height(node.right));
		
		if(heightDiff > 1)
			return false;
		else
			return (checkBalanced(node.left) && checkBalanced(node.right));
				
	}
    public void printPaths(TreeNode node, List<Integer> values)
    {
    	if(node!=null){
    		values.add(node.data);
    	}
    	if(node.left==null && node.right==null){
    		System.out.println();
    		for(int i=0;i<values.size();i++)
    			System.out.print(" " +values.get(i));
    		
    	}
    	else{
    		printPaths(node.left, values);
    		printPaths(node.right, values);
    		values.remove(node);
    	}
    		
    }
	
    public static TreeNode createBalTree(int arr[], int start, int end) {
    	if(end < start)
    		return null;
    	int mid = (start + end)/2;
    	TreeNode nd = new TreeNode(arr[mid]);
    	nd.left = createBalTree(arr,start,mid-1);
    	nd.right = createBalTree(arr, mid+1, end);
    	
    	return nd;
    }
    
    public static TreeNode createBalancedTree(int array[]) {
    	
    	return createBalTree(array, 0, array.length - 1);
    }
    
    
    public static void printTreeInOrder(TreeNode root)
	{
		Stack<TreeNode> st = new Stack<TreeNode>();
		if(root==null)
			System.out.println("Empty Tree...");

		boolean done = true;
		TreeNode current = root;
		while(done)
		{
			if(current != null)
			{
				st.push(current);
				current = current.left;
			}
			else
			{
				if(!st.isEmpty())
				{
					current = st.pop();
					System.out.println("Node value is " +current.data);
					current = current.right;
				}
				else
					done = false;
			}
		}
	}
    
    public static boolean checkifBST(TreeNode node, int MIN, int MAX){
    	
    	if(node == null)
    		return true;
    	if(node.data > MAX || node.data <= MIN)
    		return false;
    	
    	if(!checkifBST(node.left, MIN, node.data) || !checkifBST(node.right,node.data, MAX))
    		return false;
    	
    	return true;
    }
    
    public static void LevelOrderLinkedList(TreeNode root) {
    	ArrayList<List<TreeNode>> result = new ArrayList<List<TreeNode>>();
    	List<TreeNode> start = new ArrayList<TreeNode>();
    	if(root != null)
    		start.add(root);
    	
    	while(start.size() > 0) {
    		result.add(start);
    		List<TreeNode> tlist = start;
    		start = new ArrayList<TreeNode>();
    		for(TreeNode nd : tlist){
    			if(nd.left!=null)
    				start.add(nd.left);
    			if(nd.right!=null)
    				start.add(nd.right);
    		}
    	}
    	
    	System.out.println();
    }

    public static TreeNode inorderSuccessor(TreeNode root, TreeNode node) {
    	
    	TreeNode succ=null;
    	if(node.right!=null){
    		TreeNode current = node.right;
    		while(current.left!=null){
    			current = current.left;
    		}
    		return current;
    	}
    	
    	while(root!=null){
    		
    		if(node.data < root.data){
    			succ = root;
    			root = root.left;
    		}
    		else if(node.data > root.data)
    			root = root.right;
    		else
    			break;
    	}
    	
    	return succ;
    }
    
    public static void verticalSum(HashMap<Integer, List<Integer>> map, TreeNode root, int x){
    	
    	if(root==null)
    		return;
    	else {
    		
    		if(map.get(x) != null){
    			List<Integer> list = map.get(x);
    			list.add(root.data);
    			map.put(x, list);
    			verticalSum(map,root.left, x -1);
    			verticalSum(map,root.right, x+1);
    		}
    		else{
    			List<Integer> list = new ArrayList<Integer>();
    			list.add(root.data);
    			map.put(x, list);
    			verticalSum(map,root.left, x -1);
    			verticalSum(map,root.right, x+1);
    		}
    	}
    	
    }
}
