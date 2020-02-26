import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LSArray {
	public void printAllAreas() throws FileNotFoundException {
		LSData[] data = (new LSData(null,null,null,null)).getData();
		String[] areas = new String[2976];
		
		for (int i =0; i<2976;i++) {
			 System.out.println("Stage "+data[i].getStage()+", ont the "+data[i].getDay()+"th day,"+data[i].getTime()+"h00 start time... has areas "+data[i].getArea());
			}

	}

	public void printAreas(String stage, String day, String startTime) throws FileNotFoundException {
		for (int i = 0; i < 2976; i++) {
			LSData obj = new LSData(null, null, null, null);
			LSData[] data = obj.getData();

			if (data[i].getStage() == stage & data[i].getDay() == day & data[i].getTime() == startTime) {	//Maybe .equals?
				System.out.println(data[i].getArea());
				data[i].incOp(4); // Increase Operation Count
				break;
			}
		}
	}

}
