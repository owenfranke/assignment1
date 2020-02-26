import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LSArray {
	public void printAllAreas() throws FileNotFoundException {
		LSData[] data = (new LSData(null, null, null, null)).getData();

		for (int i = 0; i < 2976; i++) {
			System.out.println("Stage " + data[i].getStage() + ", " + data[i].getDay() + "th day," + data[i].getTime()
					+ "h00 start time - has areas " + data[i].getArea());
		}

	}

	public void printAreas(String stage, String day, String startTime) throws FileNotFoundException {
		boolean flag=false;
		for (int i = 0; i < 2976; i++) {
			LSData obj = new LSData(null, null, null, null);
			LSData[] data = obj.getData();

			if (data[i].getStage().equals(stage) & data[i].getDay().equals(day) & data[i].getTime().equals(startTime)) { // Maybe
																											// .equals?
				System.out.println(data[i].getArea());
				data[i].incOp(4); // Increase Operation Count
				flag=true;
			}
		}
		if (flag==false)
				System.out.println("areas not found");
	}

}
