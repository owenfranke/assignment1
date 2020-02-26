import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LSData {
	public static LSData[] data = new LSData[2976];

	private Integer opCount = 0;
	private String stage;
	private String day;
	private String time;
	private String area;

	public LSData(String stage, String day, String time, String area) {
		this.stage = stage;
		this.day = day;
		this.time = time;
		this.area = area;
	}

	public LSData[] getData() throws FileNotFoundException {
		File f = new File(
				"/home/owen/eclipse-workspace/Assignment1/src/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
		Scanner file = new Scanner(f);

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

		return data;
	}

	public void incOp(Integer operations) {
		opCount += operations;
	}

	public String getStage() {
		return stage;
	}

	public String getDay() {
		return day;
	}

	public String getTime() {
		return time;
	}

	public String getArea() {
		return area;
	}
}
