package hands_on_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileLoad2 {

	public static void main(String[] args) throws IOException
	{
		String dataFile = "./src/hands_on_4/iris.csv";
		
		// Define buffer and split element
		BufferedReader br;
		String splitter = ",";
		
		// Create and ArrayList for Flowers (flowerList) 
		ArrayList<Flower> flowers = new ArrayList<Flower>();
		
		FileReader fr = new FileReader(dataFile);
		br = new BufferedReader(fr);
		String line = null;
		while((line = br.readLine()) != null){
			//System.out.println(line);
			String[] words = line.split(splitter);
			flowers.add(new Flower(words[4],words[0],words[1],words[2],words[3]));
		}
		br.close();
		
		for(Flower fl : flowers){
			fl.print_name();
		}
		
	}

}