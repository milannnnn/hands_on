package hands_on_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileLoad {

	public static void main(String[] args){
		
		String dataFile = "./src/hands_on_4/iris.csv";
		
		BufferedReader br;
		String splitter = ",";
		
		ArrayList<Flower> flowers = new ArrayList<Flower>();
		
		// ########################################################################
		// ### Java has "CHECKED EXCEPTIONS" which, if a method CAN THROW THEM, ###
		// ### MUST be HANDELED (either with THROWS, or with TRY-CATCH-FINALLY) ###
		// ### e.g. "FileNotFoundException" or "IOException" thrown in here!!!  ###
		// ########################################################################

		try {
			FileReader fr = new FileReader(dataFile);
			br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null){
				//System.out.println(line);
				String[] words = line.split(splitter);
				flowers.add(new Flower(words[4],words[0],words[1],words[2],words[3]));
			}
			br.close();
		}
		
		catch (FileNotFoundException e) {
			System.out.println("The specified file cannot be found, please check the path!!!");
		}
		catch (IOException e) { 
			System.out.println("I/O Problems (Read,Writing,Permissions,Space...)!!!");
		}
		
		// Finally is executed regardless of Catch-Try Result!!!
		finally{
			for(Flower fl : flowers){
				fl.print_name();
			}
		}

		
	}

}