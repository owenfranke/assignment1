import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.xml.crypto.Data;

public class LSArray {
	public void printAllAreas() throws FileNotFoundException {
		LSData[] data = (new LSData(null, null)).getData();
		
		

		for (int i = 0; i < data.length; i++) {
			Scanner l = new Scanner(data[i].getKey()).useDelimiter("_");

			String stage = l.next();
			String day = l.next();
			String time = l.next();
			
			
			
			System.out.println("Stage " + stage + ", " + day + "th day," + time
					+ "h00 start time - has areas " + data[i].getArea());
		}

	}

	public void printAreas(String stage, String day, String startTime) throws FileNotFoundException {
		boolean flag=false;
		LSData obj = new LSData(null, null);
		LSData[] data = obj.getData();
		String target = stage+"_"+day+"_"+startTime;
		for (int i = 0; i < data.length; i++) {
			obj.incOp(); // Increase Operation Count
			if (target.equals(data[i].getKey())) { 
																								
				System.out.println("The Areas affected are: "+data[i].getArea());
				
				flag=true;
				break;
			
			}
			
		}
		if (flag==false) {
				System.out.println("areas not found");}
		
		obj.writeOperations();
		
	}

}
