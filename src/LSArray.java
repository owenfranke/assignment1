import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LSArray {
	public void printAllAreas() throws FileNotFoundException {
		LSData obj = new LSData(null, null, null, null);
		LSData[] data = obj.getData();
		String line = "";
		for (int i = 0; i < 2976; i++) {
			line += data[i].getArea();
		}

		Scanner l = new Scanner(line).useDelimiter(",");

		ArrayList<String> a = new ArrayList<String>();
		while (l.hasNext()) {
			a.add(l.next());
		}

		ArrayList<String> afin = (ArrayList<String>) a.stream().distinct().collect(Collectors.toList());
		for (int i = 0; i < afin.size(); i++) {
			System.out.println(afin.get(i));
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
