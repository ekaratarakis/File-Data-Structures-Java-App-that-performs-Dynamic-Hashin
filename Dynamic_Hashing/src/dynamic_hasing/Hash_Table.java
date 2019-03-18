package dynamic_hasing;

public class Hash_Table 
{
	final static int N = 100; // size of the static array
	private Tree[] HTable;

	public Hash_Table() // Constructor of the class Hash_Table
	{
		HTable = new Tree[N];
	}
	
	public void initialize() // initialization of Hash Table
	{
		for(int i = 0; i < N; i++)
		{
			HTable[i] = new Tree();
		}
	}
	
	public int hashingFunction(int key)
	{
		int position = key % N; // mod
		return position;
	}

	public Tree getHTable(int k) {
		return HTable[k];
	}

	public void setHTable(Tree[] hTable) {
		HTable = hTable;
	}

	public static int getN() {
		return N;
	}

}
