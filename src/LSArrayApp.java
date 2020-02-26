import java.io.FileNotFoundException;

//Owen Franke
//FRNOWE001
//February 2020



public class LSArrayApp {

////Main method

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length == 3)
			(new LSArray()).printAreas(args[0], args[1], args[2]);
		else
			(new LSArray()).printAllAreas();
		
		

	}

}
