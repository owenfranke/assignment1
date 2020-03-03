
import java.io.FileNotFoundException;

public class LSBSTTree {
	
	
	public void printAllAreas() throws FileNotFoundException {
		BinarySearchTree<LSBSTData> data = new LSBSTData(null,null).getData();
		
		data.inOrder();
		
	}
	public void printAreas(String stage, String day, String startTime) throws FileNotFoundException {
		String key = stage+"_"+day+"_"+startTime;
		LSBSTData target = new LSBSTData(key,null);
		BinarySearchTree<LSBSTData> d = new LSBSTData(null,null).getData();
		
		BinaryTreeNode<LSBSTData> fin = d.find(target);
		target.getData();
		target.IncreaseCount();
		try {
			System.out.println(fin.data.toString());
			target.writeOperations();
			
		} catch(NullPointerException e) {
			System.out.println("Data not found");
			
		}
		
	}
		
	}

