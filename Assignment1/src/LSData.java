import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LSData {
	

	private Integer opCount = 0;
	private String key;
	private String area;

	public LSData(String key, String area) {
		this.key = key;
		this.area = area;
	}

	public LSData[] getData() throws FileNotFoundException {
		
		File check = new File(
				"/home/owen/eclipse-workspace/Assignment1/src/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
		Scanner checker = new Scanner(check);

		int j = 0;

		while (checker.hasNextLine()) {
			checker.nextLine();
			j++;

		}
		checker.close();
		LSData[] data = new LSData[j];
		
		File f = new File(
				"/home/owen/eclipse-workspace/Assignment1/src/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
		Scanner file = new Scanner(f);

		int i = 0;

		while (file.hasNextLine()) {
			String line = file.nextLine();

			

			int p = line.indexOf(" ");
			String area = line.substring(p);	
			String key = line.substring(0,p);
			data[i] = new LSData(key, area);
			i++;
		}
		file.close();

		return data;
	}

	public void writeOperations() throws FileNotFoundException{
		PrintWriter write = new PrintWriter("Array Operation Count.txt");
				write.println(opCount);
				write.close();
	}
	
	public void incOp() {
		opCount++;
	}
	
	public String getKey() {
		return key;
	}
	
	public String getArea() {
		return area;
	}
}
