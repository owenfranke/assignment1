import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.File;
import java.io.FileNotFoundException;

public class LSArrayApp {

////Main method
	private static LSData[] data = new LSData[2976];

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File(
				"/home/owen/eclipse-workspace/Assignment1/src/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
		Scanner file = new Scanner(f);
		int len = 2976;

		int i = 0;

		while (file.hasNextLine()) {
			String line = file.nextLine();
			Scanner l = new Scanner(line).useDelimiter("_");
			String stage = l.next();
			String day = l.next();
			String time = l.next().substring(0, 2);

			int p = line.indexOf(" ");
			String area = line.substring(p);

			data[i] = new LSData(stage, day, time, area);
			i++;
		}
		file.close();
	}

	//// Methods
	public static void printAreas(String stage, String day, String startTime) {
		for (int i = 0; i < 2976; i++) {
			if (data[i].getStage() == stage & data[i].getDay() == day & data[i].getTime() == startTime) {
				System.out.println(data[i].getArea());
				break;
			}
		}
	}

	public static void printAllAreas() {
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

}
