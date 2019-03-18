package dynamic_hasing;

public class TreeNode 
{
	private static int empty = -200;
	private int key1;
	private int key2;
	private int level;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode() // Constructor of the class TreeNode
	{
		this.key1 = empty;
		this.key2 = empty;
		this.level = empty;
		this.left = null;
		this.right = null;
	}
	
	public boolean isLeaf() // Method for checking for leaves
	{
		boolean exists = true;
		if((this.getLeft() != null) && (this.getRight() != null))
		{
			exists = false;
		}
		return exists;
	}
	
	public boolean isEmpty() // Method for checking if a node is empty
	{
		boolean emptyNode = false;
		if((this.getKey1() == empty) && (this.getKey2() == empty))
		{
			emptyNode = true;
		}
		return emptyNode;
	}
	
	public boolean FullNode() // Method for checking if a node is full
	{
		boolean fullnode = false;
		if((this.getKey1() != empty) && (this.getKey2() != empty))
		{
			fullnode = true;
		}
		return fullnode;
	}
	
	public void printNode() // Method for printing nodes
	{
		System.out.println("Key1:\n"+ getKey1());
		System.out.println("Key2:\n"+ getKey2());
		System.out.println("Level\n:"+ getLevel());
	}
	
////////////////////////////SETTERS - GETTERS ////////////////////////////
	
	public static int getEmpty() {
		return empty;
	}

	public static void setEmpty(int empty) {
		TreeNode.empty = empty;
	}

	public int getKey1() {
		return key1;
	}

	public void setKey1(int key1) {
		this.key1 = key1;
	}

	public int getKey2() {
		return key2;
	}

	public void setKey2(int key2) {
		this.key2 = key2;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

}
