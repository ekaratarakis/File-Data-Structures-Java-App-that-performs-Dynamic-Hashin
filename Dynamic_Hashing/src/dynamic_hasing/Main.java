package dynamic_hasing;

import java.util.Random;

public class Main 
{

	public static void main(String[] args) 
	{
		Random randomVar = new Random();
		int max, min;
		int key = 0;
		int hashTablePosition = 0;
		Tree hashTree = null;
		
		Hash_Table hash = new Hash_Table();
		max = 1000;
		min = 1;
		int[] comparisonOfInserts = new int[20];
		int[] comparisonOfSearches = new int[20];
		int[] comparisonOfDeletes = new int[20];
		
//**********************************************************************************************************************//
		
		for(int i = 0; i < 20; i++)
		{
			key = randomVar.nextInt(max - min + 1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.insertIntoTree(hashTree.getRoot(), key);
			//hashTree.printTree(hashTree.getRoot());
			comparisonOfInserts[i] = hashTree.getInsertComp();
		}
		
		System.out.println("The avarege number of insert comparisons while inserting 20 new keys is :" + avg(comparisonOfInserts, 20));
		
		for(int j = 0; j < 20; j++)
		{
			key = randomVar.nextInt(max - min +1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.searchMethod(hashTree.getRoot(), key, 0);
			comparisonOfSearches[j] = hashTree.getSearchComp();
		}
		
		System.out.println("The avarege number of search comparisons while searching 20 new keys is :" + avg(comparisonOfSearches , 20));
		
		for(int z = 0; z < 20; z++)
		{
			key = randomVar.nextInt(max - min +1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.searchMethod(hashTree.getRoot(), key, 0);
			comparisonOfDeletes[z] = hashTree.getDeleteComp();
		}
		
		System.out.println("The avarege number of delete comparisons while deleting 20 new keys is :" + avg(comparisonOfDeletes, 20));
		
//**********************************************************************************************************************//			
		
		for(int i = 0; i < 100; i++)
		{
			key = randomVar.nextInt(max - min +1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.insertIntoTree(hashTree.getRoot(), key);
			//hashTree.printTree(hashTree.getRoot());
			comparisonOfInserts[i] = hashTree.getInsertComp();
		}
		
		System.out.println("The avarege number of insert comparisons while inserting 100 new keys is :" + avg(comparisonOfInserts, 20));
		
		for(int j = 0; j < 100; j++)
		{
			key = randomVar.nextInt(max - min +1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.searchMethod(hashTree.getRoot(), key, 0);
			comparisonOfSearches[j] = hashTree.getSearchComp();
		}
		
		System.out.println("The avarege number of search comparisons while searching 100 new keys is :" + avg(comparisonOfSearches , 20));
		
		for(int z = 0; z < 100; z++)
		{
			key = randomVar.nextInt(max - min +1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.searchMethod(hashTree.getRoot(), key, 0);
			comparisonOfDeletes[z] = hashTree.getDeleteComp();
		}
		
		System.out.println("The avarege number of delete comparisons while deleting 100 new keys is :" + avg(comparisonOfDeletes, 20));
	

//**********************************************************************************************************************//	
	
		for(int i = 0; i < 1000; i++)
		{
			key = randomVar.nextInt(max - min +1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.insertIntoTree(hashTree.getRoot(), key);
			//hashTree.printTree(hashTree.getRoot());
			comparisonOfInserts[i] = hashTree.getInsertComp();
		}
		
		System.out.println("The avarege number of insert comparisons while inserting 1000 new keys is :" + avg(comparisonOfInserts, 20));
		
		for(int j = 0; j < 1000; j++)
		{
			key = randomVar.nextInt(max - min +1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.searchMethod(hashTree.getRoot(), key, 0);
			comparisonOfSearches[j] = hashTree.getSearchComp();
		}
		
		System.out.println("The avarege number of search comparisons while searching 1000 new keys is :" + avg(comparisonOfSearches , 20));
		
		for(int z = 0; z < 1000; z++)
		{
			key = randomVar.nextInt(max - min +1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.searchMethod(hashTree.getRoot(), key, 0);
			comparisonOfDeletes[z] = hashTree.getDeleteComp();
		}
		
		System.out.println("The avarege number of delete comparisons while deleting 1000 new keys is :" + avg(comparisonOfDeletes, 20));
		
//**********************************************************************************************************************//	
	
		for(int i = 0; i < 10000; i++)
		{
			key = randomVar.nextInt(max - min +1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.insertIntoTree(hashTree.getRoot(), key);
			//hashTree.printTree(hashTree.getRoot());
			comparisonOfInserts[i] = hashTree.getInsertComp();
		}
		
		System.out.println("The avarege number of insert comparisons while inserting 10000 new keys is :" + avg(comparisonOfInserts, 20));
		
		for(int j = 0; j < 10000; j++)
		{
			key = randomVar.nextInt(max - min +1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.searchMethod(hashTree.getRoot(), key, 0);
			comparisonOfSearches[j] = hashTree.getSearchComp();
		}
		
		System.out.println("The avarege number of search comparisons while searching 10000 new keys is :" + avg(comparisonOfSearches , 20));
		
		for(int z = 0; z < 10000; z++)
		{
			key = randomVar.nextInt(max - min +1) + min;
			hashTablePosition = hash.hashingFunction(key);
			hashTree = hash.getHTable(hashTablePosition);
			hashTree.searchMethod(hashTree.getRoot(), key, 0);
			comparisonOfDeletes[z] = hashTree.getDeleteComp();
		}
		
		System.out.println("The avarege number of delete comparisons while deleting 10000 new keys is :" + avg(comparisonOfDeletes, 20));
	}
		
//**********************************************************************************************************************//	
	
	public static int avg(int[] avarege, int n)
	{
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			sum = sum + avarege[i];
		}
		return sum/n;
	}
}
	
	
	
	
	
	
	
	
	
	

