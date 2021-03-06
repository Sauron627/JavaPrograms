package metro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class MetroReader {

	public static String[][] allomasok;
	public static int metro;
	public static int villamos;

	public static void read(String FilePath) throws IOException {
    	
    	
        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(FilePath));
           

            String beSzoveg;
            String[] Szoveg;
            
            
            beSzoveg = inputStream.readLine();
            Szoveg = beSzoveg.split(" ");
            metro = Integer.parseInt(Szoveg[0]);
            villamos = Integer.parseInt(Szoveg[1]);
            allomasok = new String[metro+villamos][metro+villamos];
            
            for(int i=0; i<metro;i++){
            	inputStream.read();
            	inputStream.read();
            	beSzoveg = inputStream.readLine();
            	allomasok[i] = beSzoveg.split(", ");
            }
            
            for(int i=metro; i<(metro+villamos);i++){
            	inputStream.read();
            	inputStream.read();
            	beSzoveg = inputStream.readLine();
            	allomasok[i] = beSzoveg.split(", ");
            }
            
            
               
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        
	}
}
