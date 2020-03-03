package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CreateTestFiles {

	public static void main(String[] args) throws IOException {
		File f = new File(
				"/home/owen/eclipse-workspace/Assignment1/src/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
		Scanner file = new Scanner(f);
Integer len = 300;
		
		for (int i = 1; i < 11; i++) {
			
			
			
				PrintWriter write = new PrintWriter("Test" + i + ".txt");
				
				for (int j = 0;j<len;j++) {
				Integer start = ThreadLocalRandom.current().nextInt(1, 2976);
				String line = Files.readAllLines(Paths.get(
						"/home/owen/eclipse-workspace/Assignment1/src/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"))
						.get(start);
				
				
				write.println(line);
				
				}
				
				write.close();		
		len+=300;
		if (len>2976){
			len=2976;
		}

		}
	

	}

}
