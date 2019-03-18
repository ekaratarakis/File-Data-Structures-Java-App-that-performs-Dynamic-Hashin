package dynamic_hasing;

public class Tree 
{
	private static int rootLevel = 0;
	private static char zeroBit = '0';
	private static int search = 0;
	private static int deleteEl = 1;
	private static int empty = -200;
	private static int firstKey = 0;
	private static int secondKey = 1;
	//private int maxDepth;
	private int insertComp;
	private int searchComp;
	private int deleteComp;
	private TreeNode root;
	
	public Tree()
	{
		this.root = new TreeNode();
		this.root.setLevel(rootLevel);
		//this.setMaxDepth(0);
		this.setInsertComp(0);
		this.setSearchComp(0);
		this.setDeleteComp(0);
	}
	
	public void divideNode(TreeNode node)
	{
		TreeNode left = new TreeNode();
		TreeNode right = new TreeNode();
		
		node.setLeft(left);
		node.setRight(right);
		
		left.setLevel(node.getLevel() + 1);
		right.setLevel(node.getLevel() + 1);
		
		if(node.FullNode())
		{
			
		}
	}
	
	public void insertIntoTree(TreeNode node, int key)
	{
		if(node.isLeaf())
		{
			if(node == getRoot())
			{
				Correct1stLevel(key);
				return;
			}
			if(node.isEmpty())
			{
				insertIntoNode(node, key);
			}
			else
			{
				collisionControl(node, key);
			}
		}
		else
		{
			String binary = Integer.toBinaryString(key);
			int LeastSignificantBit = binary.toCharArray().length - node.getLevel() - 1;
			this.setInsertComp(this.getInsertComp() + 1);
			
			if(binary.toCharArray()[LeastSignificantBit] == zeroBit)
			{
				insertIntoNode(node.getLeft(), key);
			}
			else
			{
				insertIntoNode(node.getRight(), key);
			}
		}
	}
	
	public void collisionControl(TreeNode node, int key)
	{
		divideNode(node);
		String binary = Integer.toBinaryString(key);
		int LeastSignificantBit = binary.toCharArray().length - node.getLevel() - 1;
		this.setInsertComp(this.getInsertComp() + 1);
		
		if(binary.toCharArray()[LeastSignificantBit] == zeroBit)
		{
			if(node.getLeft().isEmpty())
			{
				insertIntoNode(node.getLeft(), key);
			}
			else
			{
				insertIntoTree(node.getLeft(), key);
			}
		}
		else
		{
			if(node.getRight().isEmpty())
			{
				insertIntoNode(node.getRight(), key);
			}
			else
			{
				insertIntoTree(node.getLeft(), key);
			}
		}
	}
	
	public void Correct1stLevel(int key)
	{
		divideNode(getRoot());
		String binary = Integer.toBinaryString(key);
		int LeastSignificantBit = binary.toCharArray().length - 1;
		this.setInsertComp(this.getInsertComp() + 1);
		
		if(binary.toCharArray()[LeastSignificantBit] == zeroBit)
		{
			insertIntoNode(getRoot().getLeft(), key);
		}
		else
		{
			insertIntoTree(getRoot().getRight(), key);
		}
	}
	
	public void insertIntoNode(TreeNode node, int key)
	{
		if(node.FullNode())
		{
			System.out.println("The node already has some elements!\n");
		}
		else if(node.isEmpty())
		{
			node.setKey1(key);
		}
		else
		{
			if(node.getKey1() == empty)
			{
				node.setKey1(key);
			}
			else
			{
				node.setKey2(key);
			}
		}
		
	}
	
//********************************************************************************************//	
	
	public boolean searchMethod(TreeNode node, int key, int type)
	{
		boolean keyFound = false;
		if(node.isLeaf())
		{
			if(searchMethod(node, key, type))
			{
				keyFound = true;
			}
		}
		else
		{
			String binary = Integer.toBinaryString(key);
			int LeastSignificantBit = binary.toCharArray().length - node.getLevel() - 1;
			
			if(type == search)
			{
				this.setSearchComp(this.getSearchComp() + 1);
			}
			else
			{
				this.setDeleteComp(this.getDeleteComp() + 1);
			}
			
			if(binary.toCharArray()[LeastSignificantBit] == zeroBit)
			{
				searchInNodeMethod(node.getLeft(), key, type);
			}
			else
			{
				searchInNodeMethod(node.getRight(), key, type);
			}
			
		}
		return keyFound;
	}
	
	public boolean searchInNodeMethod(TreeNode node, int key, int type)
	{
		boolean keyFound = false;
		
		if(type == search)
		{
			if((key == node.getKey1()) || (key == node.getKey2()))
			{
				keyFound = true;
				System.out.println("The key was found");
			}
		}
		if(type == deleteEl)
		{
			if(key == node.getKey1())
			{
				System.out.println("Proccess: Removing the first key.\n");
				node.setKey1(empty);
			}
			else if(key == node.getKey2())
			{
				System.out.println("Proccess: Removing the second key.\n");
				node.setKey2(empty);
			}
			else
			{
				System.out.println("Key not found.\n");
			}
		}
		return keyFound;
	}
	
//********************************************************************************************//
	
	public void deleteElement(int key)
	{
		searchMethod(this.getRoot(), key, deleteEl);
	}

////////////////////////////SETTERS - GETTERS //////////////////////////// 
	
	public static int getRootLevel() {
		return rootLevel;
	}

	public static void setRootLevel(int rootLevel) {
		Tree.rootLevel = rootLevel;
	}

	public static char getZeroBit() {
		return zeroBit;
	}

	public static void setZeroBit(char zeroBit) {
		Tree.zeroBit = zeroBit;
	}

	public static int getSearch() {
		return search;
	}

	public static void setSearch(int search) {
		Tree.search = search;
	}

	public static int getDeleteEl() {
		return deleteEl;
	}

	public static void setDeleteEl(int deleteEl) {
		Tree.deleteEl = deleteEl;
	}

	public static int getEmpty() {
		return empty;
	}

	public static void setEmpty(int empty) {
		Tree.empty = empty;
	}

	public static int getFirstKey() {
		return firstKey;
	}

	public static void setFirstKey(int firstKey) {
		Tree.firstKey = firstKey;
	}

	public static int getSecondKey() {
		return secondKey;
	}

	public static void setSecondKey(int secondKey) {
		Tree.secondKey = secondKey;
	}

	/*public int getMaxDepth() {
		return maxDepth;
	}

	public void setMaxDepth(int maxDepth) {
		this.maxDepth = maxDepth;
	}*/

	public int getInsertComp() {
		return insertComp;
	}

	public void setInsertComp(int insertComp) {
		this.insertComp = insertComp;
	}

	public int getSearchComp() {
		return searchComp;
	}

	public void setSearchComp(int searchComp) {
		this.searchComp = searchComp;
	}

	public int getDeleteComp() {
		return deleteComp;
	}

	public void setDeleteComp(int deleteComp) {
		this.deleteComp = deleteComp;
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	

}
