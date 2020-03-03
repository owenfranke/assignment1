import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class LSBSTData implements Comparable<LSBSTData>{
	private Integer opCount = 0;
	private Integer opCountInsert =0;
	
	private String key;
	private String area;

	public LSBSTData(String key, String area) {
		this.key = key;
		this.area = area;
	}

	public BinarySearchTree<LSBSTData> getData() throws FileNotFoundException {

		BinarySearchTree<LSBSTData> data = new BinarySearchTree<LSBSTData>();
		File f = new File(
				"/home/owen/eclipse-workspace/Assignment1/src/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
		Scanner file = new Scanner(f);

		int i = 0;

		while (file.hasNextLine()) {
			String line = file.nextLine();

			int p = line.indexOf(" ");
			String area = line.substring(p);
			String key = line.substring(0, p);
			data.insert(new LSBSTData(key, area));
			IncreaseCountInsert();
			i++;
		}
	
		file.close();

		return data;

	}

	//Overide
	public int compareTo(LSBSTData obj) {
		if (obj.getKey().equals(this.getKey()))	{
			return 0;
		} else if (obj.getKey().compareTo(this.getKey())>0) {
			return 1;
		} else {
		return -1;
		}
	}
	
	public String toString() {
		Scanner l = new Scanner(this.getKey()).useDelimiter("_");

		String stage = l.next();
		String day = l.next();
		String time = l.next();
		
		
		
		return ("Stage " + stage + ", " + day + "th day," + time
				+ "h00 start time - has areas " + this.getArea());
		
	
	}
	public void writeOperations() throws FileNotFoundException{
		PrintWriter write = new PrintWriter("Binary Operation Count.txt");
		Integer total = opCount+opCountInsert;
				write.println("Find Operations: "+opCount);
				write.println("Insert Operations: "+opCountInsert);
				write.println("Total Operation Count: "+total);
				write.close();
	}
	
	public void IncreaseCount() {
		opCount++;
	}
	public void IncreaseCountInsert() {
		opCountInsert++;
	}
	
	public String getKey() {
		return key;
	}
	public String getArea() {
		return area;
	}

}